package com.designpattern.cases.behavior.state;

/**
 * 重复投票
 */
public class RepeatVoteState implements VoteState{

    @Override
    public void vote(String voter, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
