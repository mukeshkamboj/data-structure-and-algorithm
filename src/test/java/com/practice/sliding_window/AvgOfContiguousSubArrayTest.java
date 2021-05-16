package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AvgOfContiguousSubArrayTest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testFindAverageOFContiguousSubArray(int subArraySize, int[] arr, double[] expected) {
    //WHEN
    var actual = new AvgOfContiguousSubArray().findAvgOfContiguousSubArray(subArraySize, arr);
    //THEN
    Assertions.assertArrayEquals(expected, actual);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2},
            new double[]{2.2, 2.8, 2.4, 3.6, 2.8})
    );
  }
}