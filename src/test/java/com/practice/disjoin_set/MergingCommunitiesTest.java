package com.practice.disjoin_set;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergingCommunitiesTest {

  @DisplayName("GIVEN the number of nodes and queries for merging and merging node into single community WHEN union and merge methods are called THEN findSize returns the correct size of the node community")
  @Test
  public void testMergingNodesIntoSingleCommunity() {
    //GIVEN
    int numberOfNode = 3;
    MergingCommunities mergingCommunities = new MergingCommunities(numberOfNode);

    // WHEN
    mergingCommunities.union(1, 2);
    mergingCommunities.union(2, 3);
    int size = mergingCommunities.getSize(1);

    //THEN
    MatcherAssert.assertThat(size, Is.is(3));
  }

  @DisplayName("GIVEN the number of nodes and queries for merging and merging nodes into multiple communities WHEN union and merge methods are called THEN findSize returns the correct size of the node community")
  @Test
  public void testMergingNodesIntoMultipleCommunities() {
    //GIVEN
    int numberOfNode = 10;
    MergingCommunities mergingCommunities = new MergingCommunities(numberOfNode);

    // WHEN
    mergingCommunities.union(1, 2);
    mergingCommunities.union(2, 3);

    mergingCommunities.union(4, 5);
    mergingCommunities.union(5, 6);
    mergingCommunities.union(7, 6);

    mergingCommunities.union(8, 9);
    mergingCommunities.union(10, 9);

    int community1Size = mergingCommunities.getSize(1);
    int community2Size = mergingCommunities.getSize(4);
    int community3Size = mergingCommunities.getSize(10);

    //THEN
    MatcherAssert.assertThat(community1Size, Is.is(3));
    MatcherAssert.assertThat(community2Size, Is.is(4));
    MatcherAssert.assertThat(community3Size, Is.is(3));
  }

  @DisplayName("GIVEN the number of nodes and no nodes are merged WHEN getSize method is called THEN findSize returns 1")
  @Test
  public void testNoMergingNodesIntoCommunities() {
    //GIVEN
    int numberOfNode = 10;
    MergingCommunities mergingCommunities = new MergingCommunities(numberOfNode);

    // WHEN
    //No merging of nodes are done.

    //THEN
    for (int i = 1; i <= 10; i++) {
      MatcherAssert.assertThat(mergingCommunities.getSize(i), Is.is(1));
    }
  }
}