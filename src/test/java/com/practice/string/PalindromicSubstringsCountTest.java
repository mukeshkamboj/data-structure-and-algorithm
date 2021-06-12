package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PalindromicSubstringsCountTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCountSubstrings(String str, int expectedCount) {
    //WHEN
    var count = new PalindromicSubstringsCount().countSubstrings(str);
    //THEN
    Assertions.assertEquals(expectedCount, count);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abc", 3),
        Arguments.arguments("aaa", 6),
        Arguments.arguments("", 0),
        Arguments.arguments("a", 1)
    );
  }

}