package com.practice.tree;

//https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumOfBST {

  public int rangeSumBST(TreeNode root, int low, int high) {

    if (root == null) {
      return 0;
    }

    if (root.val < low) {
      return rangeSumBST(root.right, low, high);
    }

    if (root.val > high) {
      return rangeSumBST(root.left, low, high);
    }

    return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
  }
}