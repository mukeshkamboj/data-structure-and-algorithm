package com.practice.tree;

import java.util.LinkedList;
import java.util.List;

public class BSTAllBranchSum {

  public List<Integer> findBranchSum(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    find(root, 0, res);
    return res;
  }

  private void find(TreeNode root, int branchSum, List<Integer> res) {
    if (root == null) {
      return;
    }

    if (root.left == null && root.right == null) {
      res.add(branchSum + root.val);
    }

    find(root.left, branchSum + root.val, res);
    find(root.right, branchSum + root.val, res);
  }
}
