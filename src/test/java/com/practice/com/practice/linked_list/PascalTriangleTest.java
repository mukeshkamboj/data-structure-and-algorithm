package com.practice.com.practice.linked_list;

import java.util.LinkedList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PascalTriangleTest {

  @DisplayName("GIVEN number of rows for pascal triangle WHEN generate method is invoked THEN pascal triangle rows are returned")
  @Test
  public void testGenerateMethod() {
    //GIVEN
    int numRows = 4;
    //WHEN
    List<List<Integer>> triangle = new PascalTriangle().generate(numRows);
    //THEN
    List<List<Integer>> triangleExpected = new LinkedList<>();
    List<Integer> row = new LinkedList<>();
    row.add(1);
    triangleExpected.add(row);

    row = new LinkedList<>();
    row.add(1);
    row.add(1);
    triangleExpected.add(row);

    row = new LinkedList<>();
    row.add(1);
    row.add(2);
    row.add(1);
    triangleExpected.add(row);

    row = new LinkedList<>();
    row.add(1);
    row.add(3);
    row.add(3);
    row.add(1);
    triangleExpected.add(row);
    MatcherAssert.assertThat(triangle, Is.is(triangleExpected));
  }

  @DisplayName("GIVEN number of rows are 1 WHEN generate method is invoked THEN first row is returned")
  @Test
  public void testGenerateMethodWithOnlySingleRow() {
    //GIVEN
    int numRows = 1;
    //WHEN
    List<List<Integer>> triangle = new PascalTriangle().generate(numRows);
    //THEN
    List<List<Integer>> triangleExpected = new LinkedList<>();
    List<Integer> row = new LinkedList<>();
    row.add(1);
    triangleExpected.add(row);

    MatcherAssert.assertThat(triangle, Is.is(triangleExpected));
  }
}