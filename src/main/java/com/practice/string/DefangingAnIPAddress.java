package com.practice.string;

//https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingAnIPAddress {

  public static String defangIPaddr(String ipAddress) {
    return ipAddress.replace(".", "[.]");
  }
}
