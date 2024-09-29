package com.devbrat2k.core.basic;

public class StringPoolExample 
{
    public static void main(String[] args) 
    {
        String a = "dev";
        String b = "dev";
        
        String c = new String("dev");
        String d = c.intern();
        
        System.out.println(a == b);     //true
        System.out.println(b == c);     //false
        
        System.out.println(a == c);     //false
        System.out.println(a == d);     //true
    }
}
