package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LengthOfLastWordTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testLengthOfLastWord(String str, int expected) {
    //WHEN
    var length = new LengthOfLastWord().lengthOfLastWord(str);
    //THEN
    Assertions.assertEquals(expected, length);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("Hello World", 5),
        Arguments.arguments(" ", 0),
        Arguments.arguments("", 0),
        Arguments.arguments("a", 1),
        Arguments.arguments(" a ", 1),
        Arguments.arguments(" a", 1)
    );
  }

}