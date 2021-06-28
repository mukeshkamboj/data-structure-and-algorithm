package com.practice.trie;

public class PrefixTree {

  private Node root = new Node();

  public void insert(String word) {
    Node ptr = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int index = ch - 'a';
      if (ptr.nodes[index] == null) {
        ptr.nodes[index] = new Node();
      }
      ptr = ptr.nodes[index];
    }
  }

  public boolean search(String word) {
    Node ptr = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int index = ch - 'a';
      if (ptr.nodes[index] == null) {
        return false;
      }
      ptr = ptr.nodes[index];
    }
    return ptr.isEnd;
  }

  public boolean searchWith(String preFix) {
    Node ptr = root;
    for (int i = 0; i < preFix.length(); i++) {
      char ch = preFix.charAt(i);
      int index = ch - 'a';
      if (ptr.nodes[index] == null) {
        return false;
      }
      ptr = ptr.nodes[index];
    }
    return true;
  }

  private static class Node {

    private Node[] nodes = new Node[26];
    private boolean isEnd;
  }
}
