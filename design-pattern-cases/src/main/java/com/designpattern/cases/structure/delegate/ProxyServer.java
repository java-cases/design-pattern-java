package com.designpattern.cases.structure.delegate;

public class ProxyServer implements Server {

    Server realServer = new FileServer();

    @Override
    public byte[] loadFile(String fileName) {
        return realServer.loadFile(fileName);
    }
}
