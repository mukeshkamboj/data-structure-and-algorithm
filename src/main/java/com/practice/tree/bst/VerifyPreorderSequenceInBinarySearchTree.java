package com.practice.tree.bst;

import java.util.Stack;

//https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/
public class VerifyPreorderSequenceInBinarySearchTree {

  public boolean validatePreorder(int[] preOrder) {
    int low = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<>();
    for (int i : preOrder) {
      if (i < low) {
        return false;
      }

      while (!stack.isEmpty() && i > stack.peek()) {
        low = stack.pop();
      }
      stack.push(i);
    }
    return true;
  }
}
