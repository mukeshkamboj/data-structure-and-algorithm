package com.practice.array;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EqualStackTest {

  @DisplayName("GIVEN 3 non empty stacks WHEN equalsStacks is invoked THEN it returns the height which is the height of all stacks")
  @Test
  public void testEqualStacks() {
    //GIVEN
    List<Integer> h1 = new ArrayList<>() {{
      add(3);
      add(2);
      add(1);
      add(1);
      add(1);
    }};
    List<Integer> h2 = new ArrayList<>() {{
      add(4);
      add(3);
      add(2);
    }};
    List<Integer> h3 = new ArrayList<>() {{
      add(1);
      add(1);
      add(4);
      add(1);
    }};

    //WHEN
    int height = new EqualStack().equalStacks(h1, h2, h3);

    //THEN
    MatcherAssert.assertThat(height, Is.is(5));
  }

  @DisplayName("GIVEN 3 empty stacks WHEN equalsStacks is invoked THEN it returns 0")
  @Test
  public void testEqualStacksWithEmptyStacks() {
    //GIVEN
    List<Integer> h1 = new ArrayList<>();
    List<Integer> h2 = new ArrayList<>();
    List<Integer> h3 = new ArrayList<>();

    //WHEN
    int height = new EqualStack().equalStacks(h1, h2, h3);

    //THEN
    MatcherAssert.assertThat(height, Is.is(0));
  }

  @DisplayName("GIVEN 1 empty stack and 2 non empty stacks where all has uWHEN equalsStacks is invoked THEN it returns 0")
  @Test
  public void testEqualStacksWith1EmptyStackAnd2NonEmptyStack() {
    //GIVEN
    List<Integer> h1 = new ArrayList<>();
    List<Integer> h2 = new ArrayList<>() {{
      add(4);
      add(3);
      add(2);
    }};
    List<Integer> h3 = new ArrayList<>() {{
      add(1);
      add(1);
      add(4);
      add(1);
    }};

    //WHEN
    int height = new EqualStack().equalStacks(h1, h2, h3);

    //THEN
    MatcherAssert.assertThat(height, Is.is(0));
  }
}