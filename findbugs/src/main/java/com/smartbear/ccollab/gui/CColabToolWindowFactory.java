package com.smartbear.ccollab.gui;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.treeStructure.Tree;
import com.smartbear.ccollab.CColabDataKeys;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

/**
 */
public class CColabToolWindowFactory implements ToolWindowFactory, DataProvider {

    private Tree view;
    private DefaultMutableTreeNode rootNode;

    public void createToolWindowContent(final Project project, ToolWindow toolWindow) {
        JPanel panel = new JPanel(new BorderLayout());
        view = new Tree();
        rootNode = new DefaultMutableTreeNode("Корень");
        view.setModel(new DefaultTreeModel(rootNode));

        panel.add(new JBScrollPane(view), BorderLayout.CENTER);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(panel, "", false);
        toolWindow.getContentManager().addContent(content);


        ActionGroup group = (ActionGroup) ActionManager.getInstance().getAction("CColab.Toolbar");
        final ActionToolbar actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, true);
        actionToolbar.setTargetComponent(panel);
        panel.add(actionToolbar.getComponent(), BorderLayout.PAGE_START);

        DataManager.registerDataProvider(panel, this);
    }

    @Nullable
    @Override
    public Object getData(@NonNls String s) {
        if (CColabDataKeys.CCOLAB_REVIEW.is(s)) return getSelectedNode();
        if (CColabDataKeys.CCOLAB_TREE_ROOT.is(s)) return getRootNode();
        return null;
    }

    public ChangeTreeNode getSelectedNode() {
        return (ChangeTreeNode) view.getSelectionModel().getLeadSelectionPath().getLastPathComponent();
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }
}
