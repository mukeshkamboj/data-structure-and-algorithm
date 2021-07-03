package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LargestNumberTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testLargestNumber(int[] arr, String expectedLargestNumber) {
//WHEN
    var largestNumber = new LargestNumber().largestNumber(arr);
    //THEN
    Assertions.assertEquals(expectedLargestNumber, largestNumber);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{30, 300, 3}, "330300"),
        Arguments.arguments(new int[]{12, 32, 9, 64}, "9643212"),
        Arguments.arguments(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, "0")
    );
  }

}