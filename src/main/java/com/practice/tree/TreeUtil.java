package com.practice.tree;

public class TreeUtil {

  public static TreeNode build(int[] arr) {
    TreeNode root = new TreeNode(arr[0]);
    for (int i : arr) {
      add(i, root);
    }
    return root;
  }

  private static TreeNode add(int val, TreeNode root) {
    if (root == null) {
      return new TreeNode(val);
    }

    if (root.val == val) {
      return root;
    } else if (root.val > val) {
      root.left = add(val, root.left);
    } else {
      root.right = add(val, root.right);
    }

    return root;
  }
}
