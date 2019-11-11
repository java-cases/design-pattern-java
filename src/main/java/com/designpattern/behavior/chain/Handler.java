package com.designpattern.behavior.chain;

public interface Handler {

    Handler successor(Handler successor);

    Handler handle(Request request);
}
