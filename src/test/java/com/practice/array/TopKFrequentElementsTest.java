package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TopKFrequentElementsTest {

  @ParameterizedTest
  @MethodSource("testDataProviders")
  public void testTopKElement(int[] arr, int k, int[] expected) {
    //WHEN
    var topKElement = new TopKFrequentElements().topKFrequent(arr, k);
    //THEN
    Assertions.assertArrayEquals(expected, topKElement);
  }

  static Stream<Arguments> testDataProviders() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{2, 1}),
        Arguments.arguments(new int[]{1}, 1, new int[]{1})
    );
  }
}