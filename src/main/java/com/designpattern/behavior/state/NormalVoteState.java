package com.designpattern.behavior.state;

/**
 *  正常投票
 */
public class NormalVoteState implements VoteState{

    @Override
    public void vote(String voter, VoteManager voteManager) {
        System.out.println("恭喜你投票成功");
    }
}
