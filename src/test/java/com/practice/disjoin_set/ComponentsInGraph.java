package com.practice.disjoin_set;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/components-in-graph/problem
public class ComponentsInGraph {

  private static Map<Integer, Node> disjointSet = new HashMap<>();

  public static List<Integer> componentsInGraph(List<List<Integer>> edges) {

    for (List<Integer> edge : edges) {
      union(edge.get(0), edge.get(1));
    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int nodeNumber : disjointSet.keySet()) {
      Node root = findRoot(nodeNumber);
      min = Math.min(min, root.getSize());
      max = Math.max(max, root.getSize());
    }
    List<Integer> components = new ArrayList<>();
    components.add(min);
    components.add(max);
    return components;
  }


  public static void union(int node1, int node2) {
    Node root1 = findRoot(node1);
    Node root2 = findRoot(node2);
    if (root1 != root2) {
      if (root1.size > root2.size) {
        root1.size += root2.size;
        root2.parent = root1;
      } else {
        root2.size += root1.size;
        root1.parent = root2;
      }
    }
  }

  public static Node findRoot(int nodeNumber) {
    Node node = disjointSet.get(nodeNumber);
    if (node == null) {
      Node newNode = new Node(nodeNumber);
      disjointSet.put(nodeNumber, newNode);
      return newNode;
    }
    if (node != node.parent) {
      node.parent = findRoot(node.parent.getValue());
    }
    return node.parent;
  }

  private static class Node {

    private int value;
    private int size;
    private Node parent;

    Node(int value) {
      this.value = value;
      this.size = 1;
      this.parent = this;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }

    public int getSize() {
      return size;
    }

    public void setSize(int size) {
      this.size = size;
    }

    public Node getParent() {
      return parent;
    }

    public void setParent(Node parent) {
      this.parent = parent;
    }
  }
}
