package com.devbrat2k.core.string;


import org.junit.jupiter.api.Assertions;

public class EndsWith {

  public static void main(String[] args) {
    String name = "dev";

    Assertions.assertTrue(name.endsWith("java"));
    Assertions.assertFalse(name.endsWith("java$"));

    Assertions.assertThrows(NullPointerException.class, ()->{
      name.endsWith(null);
    });
  }
}
