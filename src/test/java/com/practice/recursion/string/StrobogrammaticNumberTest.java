package com.practice.recursion.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StrobogrammaticNumberTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testStrobogrammaticNumber(String num, boolean expected) {
    //WHEN
    var isStrobogrammaticNumber = new StrobogrammaticNumber().isStrobogrammaticNumber(num);
    //THEN
    Assertions.assertEquals(expected, isStrobogrammaticNumber);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("0", true),
        Arguments.arguments("1", true),
        Arguments.arguments("8", true),
        Arguments.arguments("2", false),
        Arguments.arguments("101", true),
        Arguments.arguments("888", true),
        Arguments.arguments("69", true),
        Arguments.arguments("96", true),
        Arguments.arguments("916", true),
        Arguments.arguments("996", false)
    );
  }

}