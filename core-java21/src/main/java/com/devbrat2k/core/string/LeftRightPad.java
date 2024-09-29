package com.devbrat2k.core.string;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;

public class LeftRightPad {

  public static void main(String[] args) {

    Assertions.assertEquals(null, StringUtils.leftPad(null, 10, " "));
    Assertions.assertEquals("dev", StringUtils.leftPad("dev", 10, " "));
    Assertions.assertEquals("       dev", StringUtils.leftPad("dev", 20, " "));

    Assertions.assertEquals("0123456789", StringUtils.leftPad("123456789", 10, "0"));
    Assertions.assertEquals("0000000789", StringUtils.leftPad("789", 10, "0"));
    Assertions.assertEquals("0000056789", StringUtils.leftPad("56789", 10, "0"));

    Assertions.assertEquals("0123456789", Strings.padStart("123456789", 10, '0'));
    Assertions.assertEquals("       dev", Strings.padStart("dev", 20, ' '));

    Assertions.assertEquals("0123456789", leftPad("123456789", 10, "0"));
    Assertions.assertEquals("       dev", leftPad("dev", 20, " "));

    //Right padding
    Assertions.assertEquals("1234567890", rightPad("123456789", 10, "0"));
    Assertions.assertEquals("dev       ", rightPad("dev", 20, " "));

    Assertions.assertEquals(null, StringUtils.rightPad(null, 50, " "));
    Assertions.assertEquals("java ", StringUtils.rightPad("java", 5, " "));
    Assertions.assertEquals("java      ", StringUtils.rightPad("java", 10, " "));

    Assertions.assertEquals("12300", StringUtils.rightPad("123", 5, "0"));
    Assertions.assertEquals("1230000000", StringUtils.rightPad("123", 10, "0"));

    Assertions.assertEquals("1234567890", Strings.padEnd("123456789", 10, '0'));
    Assertions.assertEquals("dev       ", Strings.padEnd("dev", 20, ' '));
  }

  public static String leftPad(String input, int length, String padStr) {

    if(input == null || padStr == null){
      return null;
    }

    if(input.length() >= length){
      return input;
    }

    int padLength = length - input.length();

    StringBuilder paddedString = new StringBuilder();
    paddedString.append(padStr.repeat(padLength));
    paddedString.append(input);

    return paddedString.toString();
  }

  public static String rightPad(String input, int length, String padStr) {

    if(input == null || padStr == null){
      return null;
    }

    if(input.length() >= length){
      return input;
    }

    int padLength = length - input.length();

    StringBuilder paddedString = new StringBuilder();
    paddedString.append(input);
    paddedString.append(padStr.repeat(padLength));

    return paddedString.toString();
  }
}
