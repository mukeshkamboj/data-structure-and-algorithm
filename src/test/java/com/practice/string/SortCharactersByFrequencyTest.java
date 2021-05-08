package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SortCharactersByFrequencyTest {


  @ParameterizedTest
  @MethodSource("testInputProvider")
  public void testFrequencySort(String str, String expected) {

    //WHEN
    var actual = new SortCharactersByFrequency().frequencySort(str);

    //THEN
    Assertions.assertEquals(expected, actual);
  }

  static Stream<Arguments> testInputProvider() {
    return Stream.of(
        Arguments.arguments("cccaaa", "aaaccc"),
        Arguments.arguments("Aabb", "bbAa")
    );
  }
}