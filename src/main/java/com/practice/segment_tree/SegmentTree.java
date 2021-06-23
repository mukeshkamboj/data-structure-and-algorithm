package com.practice.segment_tree;

public class SegmentTree {

  private Node root;
  private int[] arr;

  SegmentTree(int[] arr) {
    this.arr = arr;
    this.root = buildTree(0, arr.length - 1);
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9, 11};
    SegmentTree tree = new SegmentTree(arr);
    System.out.println();
  }

  private Node buildTree(int start, int end) {
//    if (start > end) {
//      return null;
//    }

    if (start == end) {
      Node node = new Node();
      node.sum = arr[start];
      return node;
    }
    int mid = (start + end) / 2;
    Node left = buildTree(start, mid);
    Node right = buildTree(mid + 1, end);
    Node node = new Node();
    node.sum = left.sum + right.sum;
    node.left = left;
    node.right = right;
    return node;
  }

  private static class Node {

    private int sum;
    private int start;
    private int end;
    private Node left;
    private Node right;
  }
}
