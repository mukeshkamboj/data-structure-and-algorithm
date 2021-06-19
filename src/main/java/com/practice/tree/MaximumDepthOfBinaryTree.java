package com.practice.tree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthOfBinaryTree {

  int max = 0;

  public int maxDepth(TreeNode root) {
    find(root, 0);
    return max;
  }

  public void find(TreeNode root, int i) {
    if (root == null) {
      max = Math.max(i, max);
      return;
    }

    find(root.left, i + 1);
    find(root.right, i + 1);

  }

  private static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
