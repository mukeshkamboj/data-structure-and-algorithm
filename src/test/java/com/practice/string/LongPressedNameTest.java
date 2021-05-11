package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongPressedNameTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsLongPressedName(String name, String typed, boolean expected) {
    //WHEN
    var actual = new LongPressedName().isLongPressedName(name, typed);

    //THEN
    Assertions.assertEquals(expected, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.of("alexa", "aalleexxaa", true),
        Arguments.of("alexa", "aalleexxaaw", false),
        Arguments.of("abc", "abc", true),
        Arguments.of("", "", true)
    );
  }
}