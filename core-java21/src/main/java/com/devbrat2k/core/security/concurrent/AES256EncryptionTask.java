package com.devbrat2k.core.security.concurrent;

import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AES256EncryptionTask implements Callable<String> {

  private static final int KEY_LENGTH = 256;
  private static final int ITERATION_COUNT = 65536;

  private String strToEncrypt;
  private String secretKey;
  private String salt;

  public AES256EncryptionTask(String strToEncrypt, String secretKey, String salt) {
    this.strToEncrypt = strToEncrypt;
    this.secretKey = secretKey;
    this.salt = salt;
  }

  @Override
  public String call() throws Exception {
    return encrypt(strToEncrypt, secretKey, salt);
  }

  public String encrypt(String strToEncrypt, String secretKey, String salt) {

    try {

      SecureRandom secureRandom = new SecureRandom();
      byte[] iv = new byte[16];
      secureRandom.nextBytes(iv);
      IvParameterSpec ivspec = new IvParameterSpec(iv);

      SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
      KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), salt.getBytes(), ITERATION_COUNT,
          KEY_LENGTH);
      SecretKey tmp = factory.generateSecret(spec);
      SecretKeySpec secretKeySpec = new SecretKeySpec(tmp.getEncoded(), "AES");

      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivspec);

      byte[] cipherText = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));
      byte[] encryptedData = new byte[iv.length + cipherText.length];
      System.arraycopy(iv, 0, encryptedData, 0, iv.length);
      System.arraycopy(cipherText, 0, encryptedData, iv.length, cipherText.length);

      return Base64.getEncoder().encodeToString(encryptedData);
    } catch (Exception e) {
      // Handle the exception properly
      e.printStackTrace();
      return null;
    }
  }
}
