package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TruncateSentenceTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testTruncateSentence(String str, int k, String expected) {
    //WHEN
    var sentences = new TruncateSentence().truncateSentence(str, k);

    //THEN
    Assertions.assertEquals(expected, sentences);
  }

  static Stream<Arguments> testDataProvider(){
    return Stream.of(
         Arguments.arguments("Hello how are you Contestant", 4, "Hello how are you"),
         Arguments.arguments("Hello how are you Contestant", 5, "Hello how are you Contestant")
    );
  }
}