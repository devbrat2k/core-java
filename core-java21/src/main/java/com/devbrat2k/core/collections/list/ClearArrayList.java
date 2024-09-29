package com.devbrat2k.core.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class ClearArrayList {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    list.clear();

    Assertions.assertEquals(0, list.size());


  }
}
