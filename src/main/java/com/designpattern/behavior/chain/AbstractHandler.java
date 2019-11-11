package com.designpattern.behavior.chain;

import java.util.Objects;

public abstract class AbstractHandler implements Handler {

    private Handler successor;
    private Object handleResult;

    public Handler getSuccessor() {
        return this.successor;
    }

    public Object getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(Object handleResult) {
        this.handleResult = handleResult;
    }

    public Handler successor(Handler successor) {
        Objects.requireNonNull(successor);

        this.successor = successor;
        return successor;
    }

    @Override
    public Handler handle(Request request) {
        Objects.requireNonNull(request);

        this.handleResult = this.handleRequest(request);

        if (this.successor != null) {
            this.successor.handle(request);
            return this.successor;
        }

        return this;
    }


    protected abstract Object handleRequest(Request request);
}
