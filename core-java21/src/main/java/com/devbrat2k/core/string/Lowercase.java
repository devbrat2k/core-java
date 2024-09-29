package com.devbrat2k.core.string;

import org.junit.jupiter.api.Assertions;

import java.util.Locale;

public class Lowercase {

  public static void main(String[] args) {
    String name = "HowToDoInJava.com";

    Assertions.assertEquals("dev.com", name.toLowerCase());

    System.out.println("dev.com".toLowerCase(new Locale("tr", "TR")));
  }
}
