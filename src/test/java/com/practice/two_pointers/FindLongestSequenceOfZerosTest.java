package com.practice.two_pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindLongestSequenceOfZerosTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindLongestSequenceOfZeros(int number, int expectedLength) {
    //WHEN
    var length = new FindLongestSequenceOfZeros().findLongestSequence(number);
    //THEN
    Assertions.assertEquals(expectedLength, length);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(1, 0),
        Arguments.arguments(32, 0),
        Arguments.arguments(529, 4),
        Arguments.arguments(9, 2)
    );
  }
}