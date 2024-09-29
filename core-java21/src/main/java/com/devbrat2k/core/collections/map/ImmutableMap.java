package com.devbrat2k.core.collections.map;

import java.util.Map;

public class ImmutableMap {
  public static void main(String[] args) {

    Map<String, String> immutableMap = Map.of("key1", "value1");

    //throws java.lang.UnsupportedOperationException
    immutableMap.put("key2", "value2");
  }
}
