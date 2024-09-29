package com.devbrat2k.puzzles;

import java.io.IOException;

public class PlayHiLoGame {

  public static void main(String[] args) {

    HiLo hiLo = new HiLo();
    try {
      hiLo.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
