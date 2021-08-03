package com.practice.tree.bst;

import com.practice.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/find-all-the-lonely-nodes/submissions/
public class FindAllTheLonelyNodes {

  public List<Integer> findLonelyNodes(TreeNode root) {
    if (root.left == null && root.right == null) {
      return new LinkedList<>();
    }

    List<Integer> res = new LinkedList<>();
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      if (node.left == null && node.right == null) {
        continue;
      }
      if (node.left == null) {
        q.add(node.right);
        res.add(node.right.val);
      } else if (node.right == null) {
        q.add(node.left);
        res.add(node.left.val);
      } else {
        q.add(node.left);
        q.add(node.right);
      }
    }
    return res;
  }
}
