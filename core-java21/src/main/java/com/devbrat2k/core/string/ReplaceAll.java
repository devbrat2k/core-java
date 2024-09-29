package com.devbrat2k.core.string;

import java.util.regex.PatternSyntaxException;
import org.junit.jupiter.api.Assertions;

public class ReplaceAll {

  public static void main(String[] args) {
    String str = "how to do in java !! a java blog !!";

    Assertions.assertEquals("how to do in scala !! a scala blog !!",
        str.replaceAll("java", "scala"));

    String blog = "how to do in java";

    Assertions.assertEquals("dev", blog.replaceAll("\\s", ""));

    Assertions.assertThrows(PatternSyntaxException.class, () -> {
      blog.replaceAll("[", "");
    });
  }
}
