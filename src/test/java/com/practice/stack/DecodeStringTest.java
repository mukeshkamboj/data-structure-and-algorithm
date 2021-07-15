package com.practice.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DecodeStringTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testDecodeString(String str, String expected) {
    //WHEN
    var decodedString = new DecodeString().decodeString(str);
    //THEN
    Assertions.assertEquals(expected, decodedString);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("3[a]2[bc]", "aaabcbc"),
        Arguments.arguments("3[a2[c]]", "accaccacc"),
        Arguments.arguments("2[abc]3[cd]ef", "abcabccdcdcdef"),
        Arguments.arguments("10[a]", "aaaaaaaaaa"),
        Arguments.arguments("abc3[cd]xyz", "abccdcdcdxyz")
    );
  }

}