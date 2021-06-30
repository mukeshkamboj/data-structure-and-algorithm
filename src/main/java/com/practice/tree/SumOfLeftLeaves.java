package com.practice.tree;

//https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {

  public int sumOfLeftLeaves(TreeNode root) {
    return find(root, false);
  }

  int find(TreeNode root, boolean isLeft) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null && isLeft) {
      return root.val;
    }

    return find(root.left, true) + find(root.right, false);
  }

}
