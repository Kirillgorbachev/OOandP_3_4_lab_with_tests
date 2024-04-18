package org.example;

public class AdapterCaeserToEncoder implements Encoder {
    CaeserEncoder cipher = new CaeserEncoder();

    @Override
    public String encode() {
        return CaeserEncoder.encryptCaeser("washing machine");
    }

    @Override
    public String decode() {
        return CaeserEncoder.decryptCaeser("dzhsrmt nzxsrmv");
    }
}
