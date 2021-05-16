package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestSubStringWithKDistinctCharactersTest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testFind(String str, int distinctChars, int expected) {
    //WHEN
    var longestSubString = new LongestSubStringWithKDistinctCharacters().find(distinctChars, str);
    //THEN
    Assertions.assertEquals(expected, longestSubString);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments("araaci", 2, 4),
        Arguments.arguments("cbbebi", 3, 5),
        Arguments.arguments("araaci", 1, 2),
        Arguments.arguments("a", 1, 1),
        Arguments.arguments("aaaaaaaaaaaaaaaaaaaa", 1, 20),
        Arguments.arguments("aaaaaaaaaaaaaaaaaaaa", 2, 20)
    );
  }
}