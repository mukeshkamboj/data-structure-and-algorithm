package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testStepsCount(String str1, String str2, int expectedStepCounts) {
//WHEN
    var stepsCount = new MinimumNumberOfStepsToMakeTwoStringsAnagram().stepsCount(str1, str2);
    //THEN
    Assertions.assertEquals(expectedStepCounts, stepsCount);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("bab", "aba", 1),
        Arguments.arguments("leetcode", "practice", 5),
        Arguments.arguments("xxyyzz", "xxyyzz", 0),
        Arguments.arguments("anagram", "mangaar", 0),
        Arguments.arguments("xyzuvwpqrlm", "abcdefghijk", 11),
        Arguments.arguments("friend", "family", 4)
    );
  }
}