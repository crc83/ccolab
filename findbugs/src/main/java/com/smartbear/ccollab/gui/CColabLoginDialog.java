package com.smartbear.ccollab.gui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.smartbear.ccollab.CColabSettings;

import javax.swing.*;

/**
 */
public class CColabLoginDialog extends DialogWrapper {

    private final CColabLoginPanel myGithubLoginPanel;
    private final Project myProject;

    // TODO: login to github must be merged with tasks server settings
    public CColabLoginDialog(final Project project) {
        super(project, true);
        myProject = project;
        myGithubLoginPanel = new CColabLoginPanel(this);
        final CColabSettings settings = CColabSettings.getInstance();
        myGithubLoginPanel.setHost(settings.getHost());
        myGithubLoginPanel.setLogin(settings.getLogin());
        myGithubLoginPanel.setPassword(settings.getPassword());
        setTitle("Login to Code Collaborator");
        setOKButtonText("Login");
        init();
    }

    protected Action[] createActions() {
        return new Action[]{getOKAction(), getCancelAction(), getHelpAction()};
    }

    @Override
    protected JComponent createCenterPanel() {
        return myGithubLoginPanel.getPanel();
    }

    @Override
    protected String getHelpId() {
        return "login_to_ccolab";
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return myGithubLoginPanel.getPreferrableFocusComponent();
    }

    @Override
    protected void doOKAction() {
        final String login = myGithubLoginPanel.getLogin();
        final String password = myGithubLoginPanel.getPassword();
        final String host = myGithubLoginPanel.getHost();
        final CColabSettings settings = CColabSettings.getInstance();
        settings.setLogin(login);
        settings.setPassword(password);
        settings.setHost(host);
        super.doOKAction();
    }

    public void clearErrors() {
        setErrorText(null);
    }
}