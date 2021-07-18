package com.practice.recursion.tree;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class KthSymbolInGrammarTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testKthGrammar(int n, int k, int expected) {
    //WHEN
    var actual = new KthSymbolInGrammar().kthGrammar(n, k);
    //THEN
    Assertions.assertEquals(expected, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(1, 1, 0),
        Arguments.arguments(2, 1, 0),
        Arguments.arguments(2, 2, 1),
        Arguments.arguments(3, 1, 0)
    );
  }
}