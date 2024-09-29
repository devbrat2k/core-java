package com.devbrat2k.core.collections.list;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

public class CheckEmptyList {

  public static void main(String[] args) {
    ArrayList<String > list = new ArrayList();

    //1

    Assertions.assertTrue(list.isEmpty());

    list.add("1");
    Assertions.assertFalse(list.isEmpty());

    list.clear();
    Assertions.assertTrue(list.isEmpty());

    //2
    Assertions.assertTrue(list.size() == 0);

    list.add("1");
    Assertions.assertTrue(list.size() == 1);

    list.clear();
    Assertions.assertTrue(list.size() == 0);
  }
}
