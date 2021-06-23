package com.practice.tree;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BSTAllBranchSumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindBranchSum(TreeNode root, List<Integer> expected) {
    //WHEN
    var branchSum = new BSTAllBranchSum().findBranchSum(root);

    //THEN
    Assertions.assertEquals(expected, branchSum);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{5, 6, 4, 7, 3, 8, 2}), List.of(14, 26))
    );
  }
}