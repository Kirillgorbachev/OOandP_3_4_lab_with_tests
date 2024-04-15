package org.example;

public class Main {
    public static void main(String[] args) {
        CaeserEncoder caeser = new CaeserEncoder();
        System.out.println("Caeser encryptor:");
        System.out.println(caeser.encrypt("washing machine"));
        System.out.println(caeser.decrypt("dzhsrmt nzxsrmv"));


        System.out.println("-------------------------------");
        System.out.println("Adapter method:");
        SpecificEncoder cipher = new AdapterCaeserToSpecificEncoder();
        System.out.println(cipher.encode());
        System.out.println(cipher.decode());
    }
}