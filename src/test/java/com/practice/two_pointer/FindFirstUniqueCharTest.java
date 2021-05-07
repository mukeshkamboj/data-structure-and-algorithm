package com.practice.two_pointer;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindFirstUniqueCharTest {

  @ParameterizedTest
  @MethodSource("testInputProviders")
  public void testFirstUniqueChar(String str, int expectedIndexOfFirstUniqueElement) {
    var indexOfFirstUniqueElement = new FindFirstUniqueChar().firstUniqueChar(str);
    Assertions.assertEquals(expectedIndexOfFirstUniqueElement, indexOfFirstUniqueElement);
  }

  static Stream<Arguments> testInputProviders() {
    return Stream.of(
        Arguments
            .arguments("leetcode", 0),
        Arguments
            .arguments("loveleetcode", 2),
        Arguments
            .arguments("aabb", -1),
        Arguments
            .arguments("", -1)
    );
  }
}