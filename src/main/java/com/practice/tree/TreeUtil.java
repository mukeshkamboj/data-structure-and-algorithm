package com.practice.tree;

import java.util.List;

public class TreeUtil {

  public static void inOrderArray(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    inOrderArray(root.left, list);
    inOrderArray(root.right, list);
  }

  public static TreeNode build(int ...arr) {
    if (arr.length == 0) {
      return null;
    }

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
