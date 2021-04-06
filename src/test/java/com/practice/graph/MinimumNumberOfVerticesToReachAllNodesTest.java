package com.practice.graph;

import static java.util.Comparator.comparingInt;

import java.util.LinkedList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfVerticesToReachAllNodesTest {

  @DisplayName("Find minimum number of vertices to reach all nodes.")
  @Test
  public void testFindMinimumVerticesToReachAllNodes() {
    List<List<Integer>> edges = new LinkedList<>();
    int vertices = 5;
    edges.add(new LinkedList<>() {{
      add(0);
      add(1);
    }});
    edges.add(new LinkedList<>() {{
      add(2);
      add(1);
    }});
    edges.add(new LinkedList<>() {{
      add(3);
      add(1);
    }});
    edges.add(new LinkedList<>() {{
      add(1);
      add(4);
    }});
    edges.add(new LinkedList<>() {{
      add(2);
      add(4);
    }});
    List<Integer> smallestSetOfVertices = new MinimumNumberOfVerticesToReachAllNodes()
        .findSmallestSetOfVertices(vertices, edges);
    smallestSetOfVertices.sort(comparingInt(v -> v));
    List<Integer> expected = new LinkedList<>();
    expected.add(0);
    expected.add(2);
    expected.add(3);
    MatcherAssert.assertThat(expected.equals(smallestSetOfVertices), Is.is(true));
  }

}