package com.practice.string;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DefangingAnIPAddressTest {

  @DisplayName("GIVEN a string of IP address WHEN defangIPaddr is invoked THEN defaned IP address is returned")
  @Test
  public void testDefangTheGivenIpAddress() {
    //GIVEN
    String ipAddress = "255.100.50.0";

    //WHEN
    var defangIpAddress = DefangingAnIPAddress.defangIPaddr(ipAddress);

    //THEN
    MatcherAssert.assertThat(defangIpAddress, Is.is("255[.]100[.]50[.]0"));
  }

  @DisplayName("GIVEN an empty string WHEN defangIPaddr is invoked THEN empty string is returned")
  @Test
  public void testGivenAnEmptyString() {
    //GIVEN
    String ipAddress = "";

    //WHEN
    var defangIpAddress = DefangingAnIPAddress.defangIPaddr(ipAddress);

    //THEN
    MatcherAssert.assertThat(defangIpAddress, Is.is(""));
  }
}