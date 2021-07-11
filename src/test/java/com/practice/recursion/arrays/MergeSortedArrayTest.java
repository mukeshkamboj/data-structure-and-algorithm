package com.practice.recursion.arrays;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MergeSortedArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMergeSortedArray(int[] nums1, int m, int[] nums2, int n, int[] expected) {
    //WHEN
    new MergeSortedArray().mergeSortedArray(nums1, m, nums2, n);
    //THEN
    Assertions.assertArrayEquals(expected, nums1);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3,
            new int[]{1, 2, 2, 3, 5, 6}),
        Arguments.arguments(new int[]{1, 1, 1, 0, 0, 0}, 3, new int[]{2, 2, 2}, 3,
            new int[]{1, 1, 1, 2, 2, 2}),
        Arguments.arguments(new int[]{5, 5, 5, 0, 0, 0}, 3, new int[]{2, 2, 2}, 3,
            new int[]{2, 2, 2, 5, 5, 5}),
        Arguments.arguments(new int[]{0}, 0, new int[]{1}, 1,
            new int[]{1}),
        Arguments.arguments(new int[]{1}, 1, new int[]{0}, 0,
            new int[]{1})
    );
  }

}