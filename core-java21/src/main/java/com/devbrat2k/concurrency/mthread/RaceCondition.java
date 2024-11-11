package com.devbrat2k.concurrency.mthread;

import java.util.stream.IntStream;

public class RaceCondition {
    int globalVar = 0;

    Runnable incrementRun = () ->  globalVar++ ;

    public static void main(String[] args) {
        IntStream a;

    }
}
