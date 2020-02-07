package com.designpattern.cases.behavior.state;

/**
 * 恶意投票
 */
public class SpiteVoteState implements VoteState{

    @Override
    public void vote(String voter, VoteManager voteManager) {
        System.out.println("你有恶意刷票行为，取消投票资格");
    }
}
