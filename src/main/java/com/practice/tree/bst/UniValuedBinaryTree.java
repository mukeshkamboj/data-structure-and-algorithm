package com.practice.tree.bst;

import com.practice.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/univalued-binary-tree/submissions/
public class UniValuedBinaryTree {

  public boolean checkUniValueBST(TreeNode root) {
    int val = root.getVal();
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      if (node.getVal() != val) {
        return false;
      }
      if (node.getRight() != null) {
        q.add(node.getRight());
      }
      if (node.getLeft() != null) {
        q.add(node.getLeft());
      }
    }
    return true;
  }
}
