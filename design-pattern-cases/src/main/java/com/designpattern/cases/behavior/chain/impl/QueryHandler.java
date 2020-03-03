package com.designpattern.cases.behavior.chain.impl;

import com.designpattern.cases.behavior.chain.AbstractHandler;
import com.designpattern.cases.behavior.chain.Request;
import com.designpattern.cases.behavior.chain.RequestType;

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
