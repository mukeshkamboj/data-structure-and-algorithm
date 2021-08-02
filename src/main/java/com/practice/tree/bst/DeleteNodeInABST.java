package com.practice.tree.bst;

import com.practice.tree.TreeNode;

//https://leetcode.com/problems/delete-node-in-a-bst/
public class DeleteNodeInABST {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }

    if (root.val == key) {
      if (root.right == null) {
        return root.left;
      }

      TreeNode ptr = root.right;
      while (ptr.left != null) {
        ptr = ptr.left;
      }
      ptr.left = root.left;
      return root.right;
    }

    if (root.val < key) {
      root.right = deleteNode(root.right, key);
    } else {
      root.left = deleteNode(root.left, key);
    }
    return root;
  }
}
