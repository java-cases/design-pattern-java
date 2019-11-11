package com.designpattern.behavior.command;

/**
 * 命令的调用者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command=command;
    }

    //执行命令
    public void executeCommand(){
        command.execute();
    }
}
