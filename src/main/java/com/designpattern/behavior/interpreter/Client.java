package com.designpattern.behavior.interpreter;

import java.util.StringTokenizer;

public class Client {

    public static void main(String[] args){
        interpret();
    }


    /**
     * 构建解析树
     */
    public static Expression buildInterpreterTree() {

        // (1 + 2)
        Expression alternation1 = Expression.terminal("1").add("2");

        // 3 + ( 1 + 2 )
        Expression alternation2 = Expression.terminal("3").add(alternation1);

        // 4 - ( 3 + ( 1 + 2 ) )
        return Expression.terminal("4").subtract(alternation2);
    }

    public static void interpret() {

        String literal="4 - ( 3 + ( 1 + 2 ) )";
        StringTokenizer tokenizer = new StringTokenizer(literal);

        while (tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken().trim();
            Boolean isDigit = test.chars().allMatch(x -> Character.isDigit(x));

            if (isDigit) {
                //return Integer.valueOf(test);
            }
        }

        Expression expression = buildInterpreterTree();
        System.out.println(expression);

        Context context=new Context("");
        System.out.println(expression.interpret(context));
    }
}
