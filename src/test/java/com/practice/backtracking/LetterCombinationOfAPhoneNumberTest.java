package com.practice.backtracking;

import static com.practice.test.TestUtil.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LetterCombinationOfAPhoneNumberTest {

  @ParameterizedTest
  @MethodSource("testInputProviders")
  public void findTestLetterCombinations(String digits, List<String> expected) {
    List<String> letterCombinations = new LetterCombinationOfAPhoneNumber()
        .letterCombinations(digits);
    Assertions.assertEquals(expected, letterCombinations);
  }

  static Stream<Arguments> testInputProviders() {
    return Stream.of(
        Arguments
            .arguments("23",
                convert(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"})),
        Arguments
            .arguments("2",
                convert(new String[]{"a", "b", "c"})),
        Arguments
            .arguments("", new ArrayList<>())
    );
  }
}