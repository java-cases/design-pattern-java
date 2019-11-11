package com.designpattern.behavior.command;

public class Client {

    public static void main(String[] args) {

        //接收者,其实是命令的真正执行者
        Receiver receiver=new Receiver();
        Command command=new ConcreteCommand(receiver);

        //命令的调用者
        Invoker invoker=new Invoker(command);
        invoker.executeCommand();
    }
}