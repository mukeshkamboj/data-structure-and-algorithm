package com.practice.recursion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class WordBreakIITest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testWordBreak(String str, List<String> dictionary, List<String> expected) {
    //WHEN
    List<String> sentences = new WordBreakII().wordBreak(str, dictionary);
    //THEN
    Assertions.assertIterableEquals(expected, sentences);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("catsanddog",
            new LinkedList<>(Arrays.asList("cat", "cats", "and", "sand", "dog")),
            new LinkedList<>(Arrays.asList("cat sand dog", "cats and dog"))),
        Arguments.arguments("pineapplepenapple",
            new LinkedList<>(Arrays.asList("apple", "pen", "applepen", "pine", "pineapple")),
            new LinkedList<>(Arrays
                .asList("pine apple pen apple", "pine applepen apple", "pineapple pen apple" ))),
        Arguments.arguments("catsandog",
            new LinkedList<>(Arrays.asList("cats", "dog", "sand", "and", "cat")),
            new LinkedList<>())
    );
  }
}