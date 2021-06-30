package com.practice.tree;

public class InvertBinaryTree {

  public void invertTree(TreeNode root) {
    if (root == null) {
      return;
    }
    TreeNode left = root.left;
    root.left = root.right;
    root.right = left;
    invertTree(root.left);
    invertTree(root.right);
  }

}
