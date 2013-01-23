package com.smartbear.ccollab.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.diff.impl.collab.ApplyPatchAction;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.testFramework.LightVirtualFile;
import com.smartbear.ccollab.CColabSettings;
import com.smartbear.ccollab.gui.ChangeTreeNode;
import com.smartbear.ccollab.rs.Diff;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

/**
 * @author Ivan Mamontov
 */
public class DownloadPatchAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = PlatformDataKeys.PROJECT.getData(anActionEvent.getDataContext());
        ChangeTreeNode data = (ChangeTreeNode) anActionEvent.getDataContext().getData("CCOLAB_REVIEW");
        if (data != null) {
            CColabSettings settings = CColabSettings.getInstance();
            Diff sf = JAXRSClientFactory.create("http://" + settings.getHost(), Diff.class);
            final String diff = sf.getDiff(settings.getLogin(), settings.getTicket(), data.getReviewId());
            VirtualFile fileByIoFile = new LightVirtualFile(data.getName(), diff);
            ApplyPatchAction.showApplyPatch(project, fileByIoFile);
        }
    }
}
