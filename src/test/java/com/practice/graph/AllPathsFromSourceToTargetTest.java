package com.practice.graph;

import static com.practice.test.TestUtil.areEqual;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllPathsFromSourceToTargetTest {

  @DisplayName("Find all the possible paths between the Source and Destination")
  @Test
  public void findAllThePossiblePaths() {

    int[][] graph = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
    int[][] result = {{0, 4}, {0, 3, 4}, {0, 1, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 4}};

    List<List<Integer>> allPathsSourceTarget = new AllPathsFromSourceToTarget()
        .allPathsSourceTarget(graph);
    boolean areEqual = areEqual(result, allPathsSourceTarget);
    MatcherAssert.assertThat(
        "expected : " + Arrays.stream(result).map(Arrays::toString).collect(toList()) + " actual : "
            + allPathsSourceTarget, areEqual);
  }
}