package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IsSubArraySubSequenceOfTheArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsSubSequence(int[] arr, int[] subArr, boolean expected) {
    //WHEN
    var isSubSequence = new IsSubArraySubSequenceOfTheArray().isSubSequence(arr, subArr);

    //THEN
    Assertions.assertEquals(expected, isSubSequence);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{3, 4, 2, 1, 5, 7, 9}, new int[]{4, 2, 7, 9}, true),
        Arguments.arguments(new int[]{3, 4, 2, 1, 5, 7, 9}, new int[]{4, 2, 7, 3}, false)
    );
  }

}