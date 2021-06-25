package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class KthLargestElementInAnArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindKthLargestElement(int[] arr, int k, int expected) {
    //WHEN
    var kthMaxElement = new KthLargestElementInAnArray().findKthLargest(arr, k);
    //THEN
    Assertions.assertEquals(expected, kthMaxElement);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{3, 2, 1, 5, 6, 4}, 2, 5),
        Arguments.arguments(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4)
    );
  }
}