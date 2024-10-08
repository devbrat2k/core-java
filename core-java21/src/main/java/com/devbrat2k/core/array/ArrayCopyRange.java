package com.devbrat2k.core.array;

import java.util.Arrays;
import java.util.List;

public class ArrayCopyRange {
  public static void main(String[] args) {
    String[] names = {"Alex", "Brian", "Charles", "David"};

    //Sub array from index '0' (inclusive) to index '2' (exclusive)
    String[] partialNames = Arrays.copyOfRange(names, 0, 2);
    // [Alex, Brian]

    System.out.println(Arrays.toString(partialNames));

    //Sub array to list
    List<String> namesList = Arrays.asList(Arrays.copyOfRange(names, 2, names.length));
    // [Charles, David]

    System.out.println(namesList);
  }
}
