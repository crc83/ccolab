package com.smartbear.ccollab.actions;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vcs.VcsBundle;
import com.smartbear.ccollab.CColabSettings;
import com.smartbear.ccollab.CodeCollaboratorClientFactory;
import com.smartbear.ccollab.gui.CColabLoginDialog;
import com.smartbear.ccollab.gui.ChangeTreeNode;
import com.smartbear.ccollab.service.api.v7001.ActionItem;
import com.smartbear.ccollab.service.api.v7001.CodeCollaborator;
import com.smartbear.ccollab.service.api.v7001.NotAuthorizedException_Exception;
import com.smartbear.ccollab.service.api.v7001.ServerNotInitializedException_Exception;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ivan Mamontov
 */
public class RefreshAction extends AnAction {

    private static final Pattern url = Pattern.compile("(.*): (.*) #(\\d*): \"(.*)\"");

    @Override
    public void actionPerformed(AnActionEvent event) {
        final Project project = event.getProject();
        DefaultMutableTreeNode treeRoot = (DefaultMutableTreeNode) event.getDataContext().getData("CCOLAB_TREE_ROOT");
        if (treeRoot != null) {
            treeRoot.removeAllChildren();
            final CColabSettings settings = CColabSettings.getInstance();

            if (Strings.isNullOrEmpty(settings.getLogin())) {
                CColabLoginDialog dialog = new CColabLoginDialog(project);
                dialog.show();
            }
            final CodeCollaborator codeCollaborator = CodeCollaboratorClientFactory.create(
                    settings.getHost(), settings.getLogin(), settings.getPassword()
            );
            try {
                final String loginTicket = codeCollaborator.getLoginTicket(settings.getLogin(), settings.getPassword());
                settings.setTicket(loginTicket);
                final List<ActionItem> actionItems = codeCollaborator.getActionItems();
                final List<ChangeTreeNode> changeTreeNodes = Lists.newLinkedList();
                for (ActionItem actionItem : actionItems) {
                    String text = actionItem.getText();
                    Matcher matcher = url.matcher(text);
                    if (matcher.matches()) {
                        changeTreeNodes.add(new ChangeTreeNode(matcher.group(4), matcher.group(4), Integer.parseInt(matcher.group(3)), matcher.group(1)));
                    }
                }
                Collections.sort(changeTreeNodes, new Comparator<ChangeTreeNode>() {
                    @Override
                    public int compare(ChangeTreeNode o1, ChangeTreeNode o2) {
                        return Integer.valueOf(o2.getReviewId()).compareTo(o1.getReviewId());
                    }
                });
                Iterable<ChangeTreeNode> filteredList = Iterables.filter(changeTreeNodes, new Predicate<ChangeTreeNode>() {
                    @Override
                    public boolean apply(ChangeTreeNode changeTreeNode) {
                        return changeTreeNode.getStatus().equals("Perform");
                    }
                });
                for (ChangeTreeNode changeTreeNode : filteredList) {
                    treeRoot.add(changeTreeNode);
                }
            } catch (NotAuthorizedException_Exception e) {
                Messages.showErrorDialog(project, VcsBundle.message("patch.apply.error", "Permission denied", e.getMessage()),
                        VcsBundle.message("patch.apply.dialog.title"));
            } catch (ServerNotInitializedException_Exception e) {
                Messages.showErrorDialog(project, VcsBundle.message("patch.apply.error", "Server not initialized", e.getMessage()),
                        VcsBundle.message("patch.apply.dialog.title"));
            }
        }
    }
}
