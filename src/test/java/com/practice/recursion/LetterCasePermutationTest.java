package com.practice.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LetterCasePermutationTest {

  @ParameterizedTest
  @MethodSource("testDataSource")
  public void testLetterCasePermutation(String str, List<String> expectedList) {
    //WHEN
    var list = new LetterCasePermutation().letterCasePermutation(str);
    //THEN
    Assertions.assertIterableEquals(expectedList, list);
  }

  static Stream<Arguments> testDataSource() {
    return Stream.of(
        Arguments.arguments("C", Arrays.asList("C", "c")),
        Arguments.arguments("3z4", Arrays.asList("3z4", "3Z4")),
        Arguments.arguments("21", Collections.singletonList("21")),
        Arguments.arguments("a1b2", Arrays.asList("a1b2", "A1b2", "A1B2", "a1B2"))
    );
  }

}