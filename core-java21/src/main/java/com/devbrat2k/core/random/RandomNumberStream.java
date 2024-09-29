package com.devbrat2k.core.random;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberStream 
{
    public static void main(String[] args) 
    {
        IntStream randomNumberStream = new Random().ints(10, 10000);

        randomNumberStream
                .limit(6)
                .forEach(System.out::println);
    }
}
