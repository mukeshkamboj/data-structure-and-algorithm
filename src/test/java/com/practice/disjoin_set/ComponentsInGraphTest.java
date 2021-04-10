package com.practice.disjoin_set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComponentsInGraphTest {

  @DisplayName("GIVEN the edges and grpah is not connected graph WHEN componentsInGraph method is invoked THEN LOW and HIGH components size is returned in a list")
  @Test
  public void testComponentLowAndHighSize() {
    //GIVEN
    int[][] inputs = {{1, 6}, {2, 7}, {3, 8}, {4, 9}, {2, 6}};
    List<List<Integer>> edges = new ArrayList<>();
    for (int[] input : inputs) {
      LinkedList<Integer> edge = new LinkedList<>();
      edge.add(input[0]);
      edge.add(input[1]);
      edges.add(edge);
    }

    //WHEN
    List<Integer> components = ComponentsInGraph.componentsInGraph(edges);

    //THEN
    MatcherAssert.assertThat(components, Is.is(new ArrayList<>() {{
      add(2);
      add(4);
    }}));
  }


  @DisplayName("GIVEN the edges that make connected graph no node is without connection WHEN componentsInGraph method is invoked THEN LOW and HIGH components size is returned in a list")
  @Test
  public void testComponentLowAndHighSizeForConnectedGraph() {
    //GIVEN
    List<List<Integer>> edges = new ArrayList<>();
    for (int i = 2; i <= 10000; i++) {
      LinkedList<Integer> edge = new LinkedList<>();
      edge.add(1);
      edge.add(i);
      edges.add(edge);
    }

    //WHEN
    List<Integer> components = ComponentsInGraph.componentsInGraph(edges);

    //THEN

    MatcherAssert.assertThat(components, Is.is(new ArrayList<>() {{
      add(10000);
      add(10000);
    }}));
  }
}