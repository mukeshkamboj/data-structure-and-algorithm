package com.practice.tree;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.practice.tree.LowestCommonAncestorOfABinaryTree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LowestCommonAncestorOfABinaryTreeTest {

  @DisplayName("GIVEN the tree and the two nodes WHEN lowestCommonAncestor is invoked THEN least common ancestor is returned")
  @Test
  public void testFindLowestCommonAncestor() {
    //GIVEN
    TreeNode root = new TreeNode(3);

    root.setLeft(new TreeNode(5));
    root.getLeft().setLeft(new TreeNode(6));
    root.getLeft().setRight(new TreeNode(2));
    root.getLeft().getRight().setLeft(new TreeNode(7));
    root.getLeft().getRight().setRight(new TreeNode(4));

    root.setRight(new TreeNode(1));
    root.getRight().setLeft(new TreeNode(0));
    root.getRight().setRight(new TreeNode(8));

    //WHEN
    LowestCommonAncestorOfABinaryTree algo = new LowestCommonAncestorOfABinaryTree();
    TreeNode ancestor = algo
        .lowestCommonAncestor(root, root.getLeft().getLeft(), root.getLeft().getRight().getRight());

    //THEN
    assertThat(ancestor, is(root.getLeft()));
  }

  @DisplayName("GIVEN the tree and the two nodes and one node is ancestor WHEN lowestCommonAncestor is invoked THEN ancestor node is returned")
  @Test
  public void testFindLowestCommonAncestorOneInGivenTwoNodeIsAncestor() {
    //GIVEN
    TreeNode root = new TreeNode(3);

    root.setLeft(new TreeNode(5));
    root.getLeft().setLeft(new TreeNode(6));
    root.getLeft().setRight(new TreeNode(2));
    root.getLeft().getRight().setLeft(new TreeNode(7));
    root.getLeft().getRight().setRight(new TreeNode(4));

    root.setRight(new TreeNode(1));
    root.getRight().setLeft(new TreeNode(0));
    root.getRight().setRight(new TreeNode(8));

    //WHEN
    LowestCommonAncestorOfABinaryTree algo = new LowestCommonAncestorOfABinaryTree();
    TreeNode ancestor = algo
        .lowestCommonAncestor(root, root.getLeft().getRight(), root.getLeft().getRight().getLeft());

    //THEN
    assertThat(ancestor, is(root.getLeft().getRight()));
  }
}