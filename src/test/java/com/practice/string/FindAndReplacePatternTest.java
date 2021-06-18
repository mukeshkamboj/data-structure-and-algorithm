package com.practice.string;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindAndReplacePatternTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindAndReplacePattern(String[] words, String p, List<String> expected) {
    //WHEN
    var actual = new FindAndReplacePattern().findAndReplacePattern(words, p);
    //THEN
    Assertions.assertIterableEquals(expected, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb",
            List.of("mee", "aqq")),
        Arguments.arguments(new String[]{"a", "b", "c"}, "a",
            List.of("a", "b", "c")),
        Arguments.arguments(new String[]{"abc", "cba", "xyx", "yxx", "yyx"}, "abc",
            List.of("abc", "cba"))
    );
  }
}