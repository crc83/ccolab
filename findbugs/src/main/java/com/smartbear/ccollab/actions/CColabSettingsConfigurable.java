package com.smartbear.ccollab.actions;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import com.smartbear.ccollab.CColabSettings;
import com.smartbear.ccollab.gui.CColabLoginPanel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Ivan Mamontov
 */
public class CColabSettingsConfigurable implements SearchableConfigurable {

    public static final String DISPLAY_NAME = "Code Collaborator";
    private CColabLoginPanel ccolabLoginPanel;

    public CColabSettingsConfigurable() {
    }

    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Override
    public String getHelpTopic() {
        return "settings.ccolab";
    }

    @Override
    public JComponent createComponent() {
        if (ccolabLoginPanel == null) {
            ccolabLoginPanel = new CColabLoginPanel();
            CColabSettings instance = CColabSettings.getInstance();
            ccolabLoginPanel.setHost(instance.getHost());
            ccolabLoginPanel.setLogin(instance.getLogin());
            ccolabLoginPanel.setPassword(instance.getPassword());
        }
        return ccolabLoginPanel.getPanel();
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {

    }

    @Override
    public void reset() {

    }

    @Override
    public void disposeUIResources() {
    }

    @NotNull
    public String getId() {
        return getHelpTopic();
    }

    @Override
    public Runnable enableSearch(String option) {
        return null;
    }
}
