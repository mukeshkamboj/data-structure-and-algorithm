package com.practice.tree.bst;

import com.practice.tree.TreeNode;
import com.practice.tree.TreeUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindAllTheLonelyNodesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindLonelyNodes(TreeNode root, List<Integer> expected) {
    //WHEN
    var lonelyNodes = new FindAllTheLonelyNodes().findLonelyNodes(root);
    //THEN
    Assertions.assertIterableEquals(expected, lonelyNodes);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(5, 4, 3, 2, 1, 10, 6, 11), Arrays.asList(3, 2, 1)),
        Arguments.arguments(TreeUtil.build(5, 3, 2, 4, 10, 6, 11), Collections.emptyList())
    );
  }
}