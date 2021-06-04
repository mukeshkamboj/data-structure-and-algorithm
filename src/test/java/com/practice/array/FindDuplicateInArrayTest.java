package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindDuplicateInArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testContainsDuplicate(int[] arr, boolean expected) {
    //WHEN
    var containsDuplicate = new FindDuplicateInArray().containsDuplicate(arr);
    //THEN
    Assertions.assertEquals(expected, containsDuplicate);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 1, 2}, true),
        Arguments.arguments(new int[]{1, 2, 3}, false),
        Arguments.arguments(new int[]{1}, false)
    );
  }
}