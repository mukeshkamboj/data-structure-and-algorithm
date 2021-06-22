package com.practice.tree;

public class FindClosestValueInBST {

  public int findClosestNumber(TreeNode root, int number) {
    return find(root, number, root.val);
  }

  private int find(TreeNode root, int number, int closest) {
    if (root == null) {
      return closest;
    }

    if (Math.abs(number - closest) > Math.abs(number - root.val)) {
      closest = root.val;
    }

    if (root.val > number) {
      return find(root.left, number, closest);
    } else if (root.val < number) {
      return find(root.right, number, closest);
    }

    return closest;
  }

}
