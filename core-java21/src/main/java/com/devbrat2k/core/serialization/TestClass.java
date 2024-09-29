package com.devbrat2k.core.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestClass implements Serializable {

  private static final long serialVersionUID = 1L;

  private String firstName;
  private String lastName ;
  private List permissions;

  public TestClass deepCopy() throws Exception {
    //Serialization of object
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(bos);
    out.writeObject(this);

    //De-serialization of object
    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream in = new ObjectInputStream(bis);
    TestClass copied = (TestClass) in.readObject();
    return copied;
  }
}
