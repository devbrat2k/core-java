package com.devbrat2k.core.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExamples {

  @SuppressWarnings("unused")
  public static void main(final String[] args) {

    List<User> list = getUnsortedUsers();

    Comparator<User> byNameComparator = new Comparator<User>() {
      @Override
      public int compare(User u1, User u2) {
        return u1.firstName().compareTo(u2.firstName());
      }
    };

    Comparator<User> byNameComparator1 = (User u1, User u2) -> u1.firstName()
        .compareTo(u2.firstName());

    Comparator<User> byNameComparator2 = (u1, u2) -> u1.firstName().compareTo(u2.firstName());

    Comparator<User> firstNameSorter = Comparator.comparing(User::firstName);
    Comparator<User> lastNameSorter = Comparator.comparing(User::lastName);
    Comparator<User> fullNameSorter = firstNameSorter.thenComparing(lastNameSorter);
    Comparator<User> reverseSorter = firstNameSorter.reversed();

    Collections.sort(list, firstNameSorter);

    List<User> sortedList = list.stream()
        .sorted(firstNameSorter)
        .collect(Collectors.toList());

    System.out.println(sortedList);
  }

  private static List<User> getUnsortedUsers() {
    return Arrays.asList(new User(1L, "A", "Q", 24),
        new User(4L, "B", "P", 22),
        new User(2L, "C", "O", 27),
        new User(3L, "D", "N", 29),
        new User(5L, "E", "M", 25));
  }
}
