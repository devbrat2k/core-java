package com.devbrat2k.mail;

import java.util.List;

public class MailTest {

  public static void main(String[] args) {

    EmailSender.sendPlainTextEmail("sender@gmail.in",
        "receiver@gmail.com",
        "Test Email",
        List.of("Hello", "World"),
        true);

    /*EmailSenderWithSSL.sendPlainTextEmail("admin@eprindia.in",
        "lokeshgupta1981@gmail.com",
        "Test Email",
        List.of("Hello", "World"),
        true);*/
  }
}
