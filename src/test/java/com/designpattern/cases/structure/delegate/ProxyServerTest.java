package com.designpattern.cases.structure.delegate;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProxyServerTest {

    @Test
    public void loadFile() {
        Server proxyServer=new ProxyServer();
        byte[] data=proxyServer.loadFile("");

        assertNotNull(data);
    }
}