package com.smartbear.ccollab.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.project.Project;

/**
 * @author Ivan Mamontov
 */
public class EditSettingsAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        showSettingsFor(PlatformDataKeys.PROJECT.getData(e.getDataContext()));
    }

    protected static void showSettingsFor(Project project) {
        ShowSettingsUtil.getInstance().showSettingsDialog(project, CColabSettingsConfigurable.DISPLAY_NAME);
    }
}
