package com.smartbear.ccollab.gui;

import org.jetbrains.annotations.NotNull;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Ivan Mamontov
 */
public class ChangeTreeNode extends DefaultMutableTreeNode {

    @NotNull
    private final String name;

    @NotNull
    private final String description;

    @NotNull
    private final String status;

    private final int reviewId;

    public ChangeTreeNode(@NotNull String name, @NotNull String description, int reviewId, @NotNull String status) {
        this.name = name;
        this.description = description;
        this.reviewId = reviewId;
        this.status = status;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    @NotNull
    public String getStatus() {
        return status;
    }

    public int getReviewId() {
        return reviewId;
    }

    @Override
    public String toString() {
        return reviewId + " : " + name;
    }
}
