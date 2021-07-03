package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ShiftingLettersTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testShiftingLetters(String val, int[] shifts, String expected) {
    //WHEN
    var afterShiftingLetters = new ShiftingLetters().shiftingLetters(val, shifts);
    //THEN
    Assertions.assertEquals(expected, afterShiftingLetters);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abc", new int[]{3, 5, 9}, "rpl"),
        Arguments.arguments("abc", new int[]{}, "abc"),
        Arguments.arguments("abc", new int[]{1}, "bbc"),
        Arguments.arguments("zzz", new int[]{1, 1, 1}, "cba")
    );
  }
}