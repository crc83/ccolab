package com.smartbear.ccollab.actions;

import com.google.common.io.Files;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.smartbear.ccollab.CColabSettings;
import com.smartbear.ccollab.DownloadDiff;
import com.smartbear.ccollab.gui.ChangeTreeNode;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import java.io.File;
import java.io.IOException;

/**
 * @author Ivan Mamontov
 */
public class DownloadFilesAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = PlatformDataKeys.PROJECT.getData(anActionEvent.getDataContext());
        ChangeTreeNode data = (ChangeTreeNode) anActionEvent.getDataContext().getData("CCOLAB_REVIEW");
        if (data != null) {
            final File rootDir = Files.createTempDir();
            CColabSettings settings = CColabSettings.getInstance();
            com.smartbear.ccollab.rs.Files sf = JAXRSClientFactory.create("http://11.120.102.48", com.smartbear.ccollab.rs.Files.class);
            final byte[] bytes = sf.downloadFiles(settings.getLogin(), settings.getTicket(), 653, "latest");
            final File to = new File(rootDir, data.getName() + ".zip");
            try {
                Files.write(bytes, to);
                DownloadDiff.unZipIt(to, rootDir);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            ShelveChangesManager.getInstance(project).
        }
    }
}
