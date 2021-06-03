package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestConsecutiveSequenceTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMaxConsecutiveSubArrayLength(int[] arr, int expectedLength) {
    //WHEN
    var longestSeqLength = new LongestConsecutiveSequence().findMaxConsecutiveSubArrayLength(arr);
    //THEN
    Assertions.assertEquals(expectedLength, longestSeqLength);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{23, 1, 22, 20, 54, 19, 24, 18, 21}, 7),
        Arguments.arguments(new int[]{23, 1, 22, 20, 54, 20, 23, 18, 19, 24, 18, 21}, 7),
        Arguments.arguments(new int[]{}, 0),
        Arguments.arguments(new int[]{12, 54, 745, 24, 75, 46}, 1),
        Arguments.arguments(new int[]{12}, 1)
    );
  }
}