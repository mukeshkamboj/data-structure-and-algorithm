package com.practice.disjoin_set;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OwlFightTest {

  @DisplayName("GIVEN owl, their friends relationship and queries WHEN whoWins method is invoked THEN owl number is returned.")
  @Test
  public void testWhoWinsReturnsTheWinningOwlNumber() {
    //GIVEN
    int owlCount = 7;
    int[][] relationship = {{1, 2}, {3, 4}, {1, 7}};
    int[] query = {1, 5};

    //WHEN
    OwlFight owlFight = new OwlFight(owlCount, relationship);
    String whoWins = owlFight.whoWins(query);

    //THEN
    MatcherAssert.assertThat(whoWins, Is.is("1"));
  }

  @DisplayName("GIVEN owl, their friends relationship and queries of same friends owls WHEN whoWins method is invoked THEN TIE is returned")
  @Test
  public void testTie() {
    //GIVEN
    int owlCount = 7;
    int[][] relationship = {{1, 2}, {3, 4}, {1, 7}};
    int[] query = {1, 2};

    //WHEN
    OwlFight owlFight = new OwlFight(owlCount, relationship);
    String whoWins = owlFight.whoWins(query);

    //THEN
    MatcherAssert.assertThat(whoWins, Is.is("TIE"));
  }
}