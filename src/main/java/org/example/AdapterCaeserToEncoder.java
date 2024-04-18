package org.example;

public class AdapterCaeserToSpecificEncoder implements SpecificEncoder {
    CaeserEncoder cipher = new CaeserEncoder();

    @Override
    public String encode() {
        return CaeserEncoder.encrypt("washing machine");
    }

    @Override
    public String decode() {
        return CaeserEncoder.decrypt("dzhsrmt nzxsrmv");
    }
}
