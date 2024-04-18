package org.example;

public class Main {
    public static void main(String[] args) {
        CaeserEncoder caeser = new CaeserEncoder();
        System.out.println("Caeser encryptor:");
        System.out.println(caeser.encryptCaeser("washing machine"));
        System.out.println(caeser.decryptCaeser("dzhsrmt nzxsrmv"));


        System.out.println("-------------------------------");
        System.out.println("Adapter method:");
        Encoder cipher = new AdapterCaeserToEncoder();
        System.out.println(cipher.encode());
        System.out.println(cipher.decode());
    }
}