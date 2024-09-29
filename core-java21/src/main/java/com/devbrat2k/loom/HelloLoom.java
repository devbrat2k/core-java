package com.devbrat2k.loom;

public class HelloLoom {
  /*public static void main(String[] args) throws InterruptedException {

    final AtomicInteger atomicInteger = new AtomicInteger();

    Runnable runnable = () -> {
      try {
        Thread.sleep(Duration.ofSeconds(1));
      } catch(Exception e) {
          System.out.println(e);
      }
      System.out.println("Work Done - " + atomicInteger.incrementAndGet());
    };

    Instant start = Instant.now();

    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
      for(int i = 0; i < 10_000; i++) {
        executor.submit(runnable);
      }
    }

    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
    System.out.println("Total elapsed time : " + timeElapsed);
  }*/
}
