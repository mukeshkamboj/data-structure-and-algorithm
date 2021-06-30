package com.practice.breadth_first_search;

import com.practice.tree.TreeNode;

public class SameTree {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    System.out.println(new SameTree().isSameTree(root, root1));
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }

    if (p == null || q == null) {
      return false;
    }

    if (p.val != q.val) {
      return false;
    }

    boolean left = isSameTree(p.left, q.left);

    if (left) {
      return isSameTree(p.right, q.right);
    }

    return false;
  }
}
