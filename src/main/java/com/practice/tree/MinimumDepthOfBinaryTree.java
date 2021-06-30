package com.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class MinimumDepthOfBinaryTree {

  public int minDepth(TreeNode root) {
    int min = 0;
    Queue<TreeNode> q = new LinkedList<>();
    if (root != null) {
      q.add(root);
    }
    while (!q.isEmpty()) {
      min++;
      int s = q.size();
      for (int i = 0; i < s; i++) {
        TreeNode n = q.poll();
        if (n.getLeft() == null && n.getRight() == null) {
          return min;
        }
        if (n.getLeft() != null) {
          q.add(n.getLeft());
        }
        if (n.getRight() != null) {
          q.add(n.getRight());
        }
      }
    }

    return min;
  }
}
