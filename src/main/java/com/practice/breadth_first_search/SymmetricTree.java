package com.practice.breadth_first_search;

import com.practice.tree.TreeNode;
import java.util.Stack;

//https://leetcode.com/problems/symmetric-tree
public class SymmetricTree {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(2);
    root.left = left;
    root.right = right;
    left.left = new TreeNode(3);
    left.right = new TreeNode(4);
    right.left = new TreeNode(4);
    right.right = new TreeNode(3);
    System.out.println(new SymmetricTree().isSymmetric(root));
  }

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    Stack<TreeNode> stack = new Stack<>();

    if (root.right != null) {
      if (root.left == null) {
        return false;
      }
      stack.add(root.right);
      stack.add(root.left);
    } else if (root.left != null) {
      return false;
    }

    while (!stack.isEmpty()) {
      TreeNode left = stack.pop();
      TreeNode right = stack.pop();

      if (right.val != left.val) {
        return false;
      }

      if (left.left != null) {
        if (right.right == null) {
          return false;
        }
        stack.add(left.left);
        stack.add(right.right);
      } else if (right.right != null) {
        return false;
      }

      if (left.right != null) {
        if (right.left == null) {
          return false;
        }
        stack.add(left.right);
        stack.add(right.left);
      } else if (right.left != null) {
        return false;
      }
    }
    return true;
  }
}
