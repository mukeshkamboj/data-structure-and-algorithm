package com.practice.disjoin_set;

import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmpiresLeftAfterInvasionTest {

  @DisplayName("GIVEN number of empires and invasions WHEN numberOfEmpireLeft method is invoked with the given invasions THEN it will return the count of remaining empires")
  @Test
  public void testFindHowManyEmpiresLeft() {
    //GIVEN
    int numberOfEmpires = 4;
    int[][] invasions = {{1, 2}, {4, 1}};

    //WHEN
    int empiresLeft = EmpiresLeftAfterInvasion
        .numberOfEmpireLeft(numberOfEmpires, invasions);

    //THEN
    MatcherAssert.assertThat(empiresLeft, is(2));
  }

}