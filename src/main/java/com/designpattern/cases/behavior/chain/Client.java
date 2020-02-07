package com.designpattern.cases.behavior.chain;

import com.designpattern.cases.behavior.chain.impl.AuthHandler;
import com.designpattern.cases.behavior.chain.impl.QueryHandler;

public class Client {

    public static void main(String[] args) {
        request();
    }

    public static void request(){

        Handler handler=new AuthHandler();
        handler.successor(new QueryHandler()).successor(new QueryHandler());

        Request request1=new Request(RequestType.AUTH,"request-1");
        Request request2=new Request(RequestType.QUERY,"request-2");


        handler.handle(request1).handle(request2);
    }
}
