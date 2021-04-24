package com.practice.disjoin_set;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {

  @DisplayName("GIVEN a matrix with connection WHEN findCircleNum is called THEN it return the count of circles")
  @Test
  public void testFindCircleNum() {
    //GIVEN
    int[][] connections = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    //WHEN
    int circleNum = new NumberOfProvinces().findCircleNum(connections);
    //THEN
    MatcherAssert.assertThat(circleNum, Is.is(2));
  }

  @DisplayName("GIVEN a matrix with no connection WHEN findCircleNum is called THEN it return the count of circles")
  @Test
  public void testFindCircleNumWithNoCircle() {
    //GIVEN
    int[][] connections = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    //WHEN
    int circleNum = new NumberOfProvinces().findCircleNum(connections);
    //THEN
    MatcherAssert.assertThat(circleNum, Is.is(3));
  }

  @DisplayName("GIVEN an empty matrix WHEN findCircleNum is called THEN it return zero")
  @Test
  public void testFindCircleNumEmptyMatrix() {
    //GIVEN
    int[][] connections = {};
    //WHEN
    int circleNum = new NumberOfProvinces().findCircleNum(connections);
    //THEN
    MatcherAssert.assertThat(circleNum, Is.is(0));
  }
}