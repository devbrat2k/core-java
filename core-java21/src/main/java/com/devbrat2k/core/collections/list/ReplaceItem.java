package com.devbrat2k.core.collections.list;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;


public class ReplaceItem {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));

    int index = list.indexOf("C");
    list.set(index, "C_NEW");

    Assertions.assertEquals("C_NEW", list.get(index));


    //2 - In single step replace D with D_NEW
    list.set( list.indexOf("D") , "D_NEW");

    Assertions.assertEquals("D_NEW", list.get(index));
  }
}
