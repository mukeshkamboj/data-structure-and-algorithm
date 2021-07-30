package com.practice.recursion.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StrobogrammaticNumberIITest {

  @ParameterizedTest
  @MethodSource("testDataSource")
  public void testFindStroborgrammaticNumbers(int n, List<String> expected) {
    //WHEN
    var strobogrammaticNumbers = new StrobogrammaticNumberII().findStroborgrammatic(n);
    //THEN
    Assertions.assertIterableEquals(expected, strobogrammaticNumbers);
  }

  static Stream<Arguments> testDataSource() {
    return Stream.of(
        Arguments.arguments(1, Arrays.asList("0", "1", "8")),
        Arguments.arguments(2, Arrays.asList("11", "69", "88", "96")),
        Arguments.arguments(3, Arrays
            .asList("101", "609", "808", "906", "111", "619", "818", "916", "181", "689", "888",
                "986"))
    );
  }

}