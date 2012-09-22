package com.smartbear.ccollab;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.smartbear.ccollab.service.api.v7001.ActionItem;
import com.smartbear.ccollab.service.api.v7001.CodeCollaborator;
import com.smartbear.ccollab.service.api.v7001.NotAuthorizedException_Exception;
import com.smartbear.ccollab.service.api.v7001.ServerNotInitializedException_Exception;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.util.List;

/**
 */
public class CColabToolWindowFactory implements ToolWindowFactory {

    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        JPanel panel = new JPanel(new BorderLayout());
        final JTree view = new JTree();
        final DefaultMutableTreeNode root = new DefaultMutableTreeNode("Корень");
        view.setModel(new DefaultTreeModel(root));
        final CodeCollaborator codeCollaborator = CodeCollaboratorClientFactory.create("", "");
        try {
            final List<ActionItem> actionItems = codeCollaborator.getActionItems();
            for (ActionItem actionItem : actionItems) {
                root.add(new DefaultMutableTreeNode(actionItem.getText()));
            }
        } catch (NotAuthorizedException_Exception e) {
            e.printStackTrace();
        } catch (ServerNotInitializedException_Exception e) {
            e.printStackTrace();
        }
        panel.add(new JScrollPane(view), BorderLayout.CENTER);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(panel, "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
