package com.designpattern.behavior.chain.impl;

import com.designpattern.behavior.chain.AbstractHandler;
import com.designpattern.behavior.chain.Request;
import com.designpattern.behavior.chain.RequestType;

public class QueryHandler extends AbstractHandler {

    public QueryHandler() {

    }

    @Override
    protected Object handleRequest(Request request) {
        if (request.getType() == RequestType.QUERY) {
            System.out.println(request.getName() + " is handled by QueryHandler");
            return request.getName();
        }

        return null;
    }
}
