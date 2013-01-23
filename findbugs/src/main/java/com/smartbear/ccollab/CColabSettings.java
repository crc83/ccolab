package com.smartbear.ccollab;

import com.google.common.base.Strings;
import com.intellij.ide.passwordSafe.MasterPasswordUnavailableException;
import com.intellij.ide.passwordSafe.PasswordSafe;
import com.intellij.ide.passwordSafe.PasswordSafeException;
import com.intellij.ide.passwordSafe.impl.PasswordSafeImpl;
import com.intellij.ide.passwordSafe.impl.providers.masterKey.MasterKeyPasswordSafe;
import com.intellij.ide.passwordSafe.impl.providers.memory.MemoryPasswordSafe;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.Messages;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

import static com.google.common.base.Objects.firstNonNull;

@State(
        name = "CColabSettings",
        storages = {
                @Storage(
                        file = "$APP_CONFIG$/ccolab_settings.xml"
                )}
)
public class CColabSettings implements PersistentStateComponent<Element> {

    private static final Logger LOG = Logger.getInstance(CColabSettings.class.getName());

    private static final String CCOLAB_SETTINGS_TAG = "CColabSettings";
    private static final String LOGIN = "Login";
    private static final String HOST = "Host";
    private static final String CCOLAB_SETTINGS_PASSWORD_KEY = "CCOLAB_SETTINGS_PASSWORD_KEY";

    private String myLogin;
    private String myTicket;
    private String myHost;
    private boolean passwordChanged = false;

    // Once master password is refused, do not ask for it again
    private boolean masterPasswordRefused = false;


    public static CColabSettings getInstance() {
        return ServiceManager.getService(CColabSettings.class);
    }

    public Element getState() {
        LOG.assertTrue(!ProgressManager.getInstance().hasProgressIndicator(), "Password should not be accessed under modal progress");

        final Project project = ProjectManager.getInstance().getDefaultProject();
        try {
            if (passwordChanged && !masterPasswordRefused) {
                PasswordSafe.getInstance().storePassword(project,
                        CColabSettings.class, CCOLAB_SETTINGS_PASSWORD_KEY,
                        getPassword());
            }
        } catch (MasterPasswordUnavailableException e) {
            LOG.info("Couldn't store password for key [" + CCOLAB_SETTINGS_PASSWORD_KEY + "]", e);
            masterPasswordRefused = true;
        } catch (Exception e) {
            Messages.showErrorDialog("Error happened while storing password for ccolab", "Error");
            LOG.info("Couldn't get password for key [" + CCOLAB_SETTINGS_PASSWORD_KEY + "]", e);
        }
        passwordChanged = false;
        final Element element = new Element(CCOLAB_SETTINGS_TAG);
        element.setAttribute(LOGIN, getLogin());
        element.setAttribute(HOST, getHost());
        return element;
    }

    public void loadState(@NotNull final Element element) {
        // All the logic on retrieving password was moved to getPassword action to cleanup initialization process
        try {
            setLogin(element.getAttributeValue(LOGIN));
            setHost(element.getAttributeValue(HOST));
        } catch (Exception e) {
            LOG.error("Error happened while loading code collaborator settings: " + e);
        }
    }

    @NotNull
    public String getLogin() {
        return Strings.nullToEmpty(myLogin);
    }

    @NotNull
    public String getTicket() {
        return Strings.nullToEmpty(myTicket);
    }

    @NotNull
    public String getPassword() {
        LOG.assertTrue(!ProgressManager.getInstance().hasProgressIndicator(), "Password should not be accessed under modal progress");
        String password;
        final Project project = ProjectManager.getInstance().getDefaultProject();
        final PasswordSafeImpl passwordSafe = (PasswordSafeImpl) PasswordSafe.getInstance();
        try {
            password = passwordSafe.getMemoryProvider().getPassword(project, CColabSettings.class, CCOLAB_SETTINGS_PASSWORD_KEY);
            if (password != null) {
                return password;
            }
            final MasterKeyPasswordSafe masterKeyProvider = passwordSafe.getMasterKeyProvider();
            if (!masterKeyProvider.isEmpty()) {
                // workaround for: don't ask for master password, if the requested password is not there.
                // this should be fixed in PasswordSafe: don't ask master password to look for keys
                // until then we assume that is PasswordSafe was used (there is anything there), then it makes sense to look there.
                password = masterKeyProvider.getPassword(project, CColabSettings.class, CCOLAB_SETTINGS_PASSWORD_KEY);
            }
        } catch (PasswordSafeException e) {
            LOG.info("Couldn't get password for key [" + CCOLAB_SETTINGS_PASSWORD_KEY + "]", e);
            masterPasswordRefused = true;
            password = "";
        }
        // Store password in memory
        try {
            passwordSafe.getMemoryProvider().storePassword(ProjectManager.getInstance().getDefaultProject(),
                    CColabSettings.class, CCOLAB_SETTINGS_PASSWORD_KEY, Strings.nullToEmpty(password));
        } catch (PasswordSafeException e) {
            LOG.info("Couldn't store password for key [" + CCOLAB_SETTINGS_PASSWORD_KEY + "]", e);
        }
        passwordChanged = false;
        return Strings.nullToEmpty(password);
    }

    public String getHost() {
        return firstNonNull(myHost, "localhost");
    }

    public void setLogin(final String login) {
        myLogin = Strings.nullToEmpty(login);
    }

    public void setTicket(final String ticket) {
        myTicket = Strings.nullToEmpty(ticket);
    }

    public void setPassword(final String password) {
        passwordChanged = !getPassword().equals(password);
        try {
            final MemoryPasswordSafe memoryProvider = ((PasswordSafeImpl) PasswordSafe.getInstance()).getMemoryProvider();
            memoryProvider.storePassword(ProjectManager.getInstance().getDefaultProject(),
                    CColabSettings.class, CCOLAB_SETTINGS_PASSWORD_KEY,
                    Strings.nullToEmpty(password));
        } catch (PasswordSafeException e) {
            LOG.info("Couldn't get password for key [" + CCOLAB_SETTINGS_PASSWORD_KEY + "]", e);
        }
    }

    public void setHost(final String host) {
        myHost = firstNonNull(host, "localhost");
    }
}