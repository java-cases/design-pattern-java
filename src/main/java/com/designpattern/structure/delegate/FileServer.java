package com.designpattern.structure.delegate;

public class FileServer implements Server {

    @Override
    public byte[] loadFile(String fileName) {
        return new byte[0];
    }
}
