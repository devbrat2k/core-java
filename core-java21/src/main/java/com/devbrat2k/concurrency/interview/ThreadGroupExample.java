package com.devbrat2k.concurrency.interview;

public class ThreadGroupExample {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getThreadGroup().getName());
  }
}
