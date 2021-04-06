package com.practice.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DijkstraInterpreterAlgorithmTest {

  @Test
  public void GIVE_correct_expression_WHEN_interpret_function_is_called_THEN_value_is_returned() {
    DijkstraInterpreterAlgorithm dijkstraInterpreterAlgorithm = new DijkstraInterpreterAlgorithm();
    String expression = "( 100 / ( ( ( 2 + 1 ) - 1 ) * 5 ) )";
    double result = dijkstraInterpreterAlgorithm.interpret(expression);
    assertThat(10.0, is(result));
  }

  @Test
  public void GIVE_expression_which_evaluated_to_infinity_divided_by_zero_condition_WHEN_interpret_function_is_called_THEN_double_with_infinity_is_returned() {
    DijkstraInterpreterAlgorithm dijkstraInterpreterAlgorithm = new DijkstraInterpreterAlgorithm();
    String expression = "( 100 / ( ( ( 2 + 1 ) - 3 ) * 5 ) )";
    Double result = dijkstraInterpreterAlgorithm.interpret(expression);
    assertThat(result.isInfinite(), is(true));
  }
}