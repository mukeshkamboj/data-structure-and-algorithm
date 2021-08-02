package com.practice.tree.bst;

import static java.util.Collections.emptyList;

import com.practice.tree.TreeNode;
import com.practice.tree.TreeUtil;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DeleteNodeInABSTTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testDeleteNode(TreeNode root, int key, List<Integer> expected) {
    //WHEN
    var tree = new DeleteNodeInABST().deleteNode(root, key);
    //THEN
    List<Integer> inOrder = new LinkedList<>();
    TreeUtil.inOrderArray(tree, inOrder);
    Assertions.assertIterableEquals(expected, inOrder);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments
            .arguments(TreeUtil.build(new int[]{5, 3, 2, 4, 6, 7}), 3,
                Arrays.asList(5, 4, 2, 6, 7)),
        Arguments
            .arguments(TreeUtil.build(new int[]{5, 3, 2, 4, 6, 7}), 8,
                Arrays.asList(5, 3, 2, 4, 6, 7)),
        Arguments
            .arguments(TreeUtil.build(new int[]{}), 0, emptyList())
    );
  }
}