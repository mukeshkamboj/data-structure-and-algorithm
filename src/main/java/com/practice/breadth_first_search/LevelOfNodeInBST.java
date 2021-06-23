package com.practice.breadth_first_search;

import com.practice.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNodeInBST {

  public int findLevelOfGivenNode(TreeNode root, int nodeValue) {
    if (root == null) {
      return -1;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int level = 0;
    while (!q.isEmpty()) {
      Queue<TreeNode> tq = new LinkedList<>();
      while (!q.isEmpty()) {
        TreeNode node = q.poll();
        if (node.getVal() == nodeValue) {
          return level;
        }
        if (node.getLeft() != null) {
          tq.add(node.getLeft());
        }
        if (node.getRight() != null) {
          tq.add(node.getRight());
        }
      }
      level++;
      q = tq;
    }

    return -1;
  }
}
