package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestSubstringWithSameLettersAfterReplacementTest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testFind(String string, int maxCharAllowedToBeReplaced, int expected) {
    //WHEN
    var longestSubString = new LongestSubstringWithSameLettersAfterReplacement()
        .find(string, maxCharAllowedToBeReplaced);

    //THEN
    Assertions.assertEquals(expected, longestSubString);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments("ABBB", 2, 4),
        Arguments.arguments("A", 1, 1),
        Arguments.arguments("AACBCCCA", 1, 5),
        Arguments.arguments("AAAAAAAAAA", 10, 10)
    );
  }
}