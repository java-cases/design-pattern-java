package com.designpattern.cases.behavior.state;

public class Client {

    public static void main(String[] args) {
        vote();
    }

    public static void vote() {

        VoteManager vm = new VoteManager();

        for (int i = 0; i < 9; i++) {
            vm.vote("u1");
        }
    }

}
