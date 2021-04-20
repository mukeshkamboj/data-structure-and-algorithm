package com.practice.string;

import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoalParserInterpretationTest {

  @DisplayName("GIVEN a command string WHEN interpret method is called THEN it returns the interpreted string")
  @Test
  public void testInterpretMethod() {
    //GIVEN
    String command = "(al)G(al)()()G";
    //WHEN
    String result = new GoalParserInterpretation().interpret(command);
    //THEN
    MatcherAssert.assertThat(result, is("alGalooG"));
  }

  @DisplayName("GIVEN an empty string WHEN interpret method is called THEN it returns the empty string")
  @Test
  public void testInterpretMethodWithEmptyString() {
    //GIVEN
    String command = "";
    //WHEN
    String result = new GoalParserInterpretation().interpret(command);
    //THEN
    MatcherAssert.assertThat(result, is(""));
  }
}