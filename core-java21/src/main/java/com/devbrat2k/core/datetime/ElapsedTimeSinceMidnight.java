package com.devbrat2k.core.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ElapsedTimeSinceMidnight {

  public static void main(String[] args) {
    System.out.println(getElapsedSecondsSinceMidnight());
    System.out.println(getElapsedMillisSinceMidnight());

    System.out.println(getElapsedSecondsSinceMidnightAtZone(ZoneOffset.ofHours(-5)));
    System.out.println(getElapsedSecondsSinceMidnightAtZone(ZoneId.of("America/New_York")));
    System.out.println(getElapsedSecondsSinceMidnightAtZone(ZoneOffset.UTC));

    System.out.println(getElapsedSecondsSinceMidnightUsingLocalDateTime());
    System.out.println(getElapsedSecondsSinceMidnightUsingZonedDateTime());
  }

  public static long getElapsedSecondsSinceMidnightAtZone(ZoneId zoneId) {

    LocalTime currentTime = LocalTime.now(zoneId);
    return ChronoUnit.SECONDS.between(LocalTime.MIDNIGHT, currentTime);
  }

  public static long getElapsedSecondsSinceMidnight() {
    LocalTime midnight = LocalTime.MIDNIGHT;
    LocalTime currentTime = LocalTime.now();
    return ChronoUnit.SECONDS.between(midnight, currentTime);
  }

  public static long getElapsedMillisSinceMidnight() {
    LocalTime midnight = LocalTime.MIDNIGHT;
    LocalTime currentTime = LocalTime.now();
    return ChronoUnit.MILLIS.between(midnight, currentTime);
  }

  public static long getElapsedSecondsSinceMidnightUsingLocalDateTime() {

    LocalDateTime currentTime = LocalDateTime.now();
    LocalDateTime midnight = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);

    return ChronoUnit.SECONDS.between(midnight, currentTime);
  }

  public static long getElapsedSecondsSinceMidnightUsingZonedDateTime() {

    ZonedDateTime currentTime = ZonedDateTime.now();
    ZonedDateTime midnight = ZonedDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT, ZoneId.systemDefault());

    return ChronoUnit.SECONDS.between(midnight, currentTime);
  }
}
