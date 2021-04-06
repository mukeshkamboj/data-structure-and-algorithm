package com.practice.dynamic_programming;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

  @Test
  public void GIVEN_prices_array_with_possible_outcome_WHEN_max_profit_is_called_THEN_it_returns_the_max_profit() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int maxProfit = new BestTimeToBuyAndSellStock().maxProfit(prices);
    assertThat(maxProfit, is(5));
  }
}