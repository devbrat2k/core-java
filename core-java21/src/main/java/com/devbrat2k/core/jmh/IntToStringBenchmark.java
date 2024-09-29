package com.devbrat2k.core.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class IntToStringBenchmark {

  private ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void methodIntegerToString(Blackhole blackhole) {
    int i =  threadLocalRandom.nextInt(1_00_000, 9_99_999);
    String s = Integer.toString(i);
    blackhole.consume(s);
  }

  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void dmethodIntegerToStringV2(Blackhole blackhole) {
    Integer i =  threadLocalRandom.nextInt(1_00_000, 9_99_999);
    String s = Integer.toString(i);
    blackhole.consume(s);
  }

  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void cmethodStringValueOf(Blackhole blackhole) {
    int i =  threadLocalRandom.nextInt(1_00_000, 9_99_999);
    String s = String.valueOf(i);
    blackhole.consume(s);
  }

  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void bmethodStringFormat(Blackhole blackhole) {
    int i =  threadLocalRandom.nextInt(1_00_000, 9_99_999);
    String s = String.format("%d", i);
    blackhole.consume(s);
  }

  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void amethodStringTemplate(Blackhole blackhole) {
    int i =  threadLocalRandom.nextInt(1_00_000, 9_99_999);
    String s = STR."\{i}";
    blackhole.consume(s);
  }

  public static void main(String[] args) throws Exception {

    Options opt = new OptionsBuilder()
        .include(IntToStringBenchmark.class.getSimpleName())
        .forks(1)
        .build();

    new Runner(opt).run();
  }
}
