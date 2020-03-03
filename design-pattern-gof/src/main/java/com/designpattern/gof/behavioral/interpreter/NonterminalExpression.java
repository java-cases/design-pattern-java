package com.designpattern.gof.behavioral.interpreter;

/**
 *
 */
public class NonterminalExpression extends Expression {

    /**
     *
     */
    private Expression left;
    /**
     *
     */
    private Expression right;

    /**
     * Default constructor
     */
    public NonterminalExpression() {
    }

    /**
     * @param context
     * @return
     */
    public Object interpret(Context context) {
        // TODO implement here
        return null;
    }

    /**
     * @param left
     * @param right
     */
    public void NonterminalExpression(Expression left, Expression right) {
        // TODO implement here
    }

}