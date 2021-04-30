package com.practice.dynamic_programming;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RussianDollEnvelopesTest {

  @DisplayName("GIVEN the envelops non empty array WHEN maxEnvelopes is invoked THEN it returns the maximum number of envelopes that can be inside the other")
  @Test
  public void testMaxEnvelopes() {
    //GIVEN
    int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
    //WHEN
    int max = new RussianDollEnvelopes().maxEnvelopes(envelopes);
    //THEN
    MatcherAssert.assertThat(max, Is.is(3));
  }

  @DisplayName("GIVEN the envelops non empty array where no envelop can be put inside another WHEN maxEnvelopes is invoked THEN it returns 1")
  @Test
  public void testMaxEnvelopesNonEmptyEnvelopeCanBePutInsideAnother() {
    //GIVEN
    int[][] envelopes = {{4, 4}, {4, 4}, {4, 4}, {4, 4}};
    //WHEN
    int max = new RussianDollEnvelopes().maxEnvelopes(envelopes);
    //THEN
    MatcherAssert.assertThat(max, Is.is(1));
  }

  @DisplayName("GIVEN the envelops empty array WHEN maxEnvelopes is invoked THEN it returns 0")
  @Test
  public void testMaxEnvelopesWithEmptyArray() {
    //GIVEN
    int[][] envelopes = {};
    //WHEN
    int max = new RussianDollEnvelopes().maxEnvelopes(envelopes);
    //THEN
    MatcherAssert.assertThat(max, Is.is(0));
  }
}