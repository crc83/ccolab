package com.smartbear.ccollab;

import com.intellij.openapi.actionSystem.DataKey;
import com.smartbear.ccollab.gui.ChangeTreeNode;

public class CColabDataKeys {

    public static final DataKey<ChangeTreeNode> CCOLAB_REVIEW = DataKey.create("CCOLAB_REVIEW");
    public static final DataKey<ChangeTreeNode> CCOLAB_TREE_ROOT = DataKey.create("CCOLAB_TREE_ROOT");

    private CColabDataKeys() {
    }
}
