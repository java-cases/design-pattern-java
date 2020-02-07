package com.designpattern.cases.behavior.chain.impl;

import com.designpattern.cases.behavior.chain.AbstractHandler;
import com.designpattern.cases.behavior.chain.Request;
import com.designpattern.cases.behavior.chain.RequestType;

public class AuthHandler extends AbstractHandler {

    public AuthHandler() {

    }

    @Override
    protected Object handleRequest(Request request) {
        if (request.getType() == RequestType.AUTH) {
            System.out.println(request.getName() + " is handled by AuthHandler");
            return request.getName();
        }

        return null;
    }
}
