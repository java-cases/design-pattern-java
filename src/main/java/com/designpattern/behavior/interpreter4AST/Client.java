package com.designpattern.behavior.interpreter4AST;

import com.designpattern.behavior.interpreter4AST.syntaxtree.Node;

import java.util.StringTokenizer;

public class Client {

    public static void main(String[] args){
        calculate();
    }


    /**
     * 构建解析树
     */
    public static Node buildInterpreterTree() {

        // (1 + 2)
        Node alternation1 = Node.valueOf("1").add("2");

        // 3 + ( 1 + 2 )
        Node alternation2 = Node.valueOf("3").add(alternation1);

        // 4 - ( 3 + ( 1 + 2 ) )
        return Node.valueOf("4").subtract(alternation2);
    }

    public static void calculate() {

        String literal="4 - ( 3 + ( 1 + 2 ) )";
        StringTokenizer tokenizer = new StringTokenizer(literal);

        while (tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken().trim();
            Boolean isDigit = test.chars().allMatch(x -> Character.isDigit(x));

            if (isDigit) {
                //return Integer.valueOf(test);
            }
        }

        Node root = buildInterpreterTree();
        System.out.println(root);

        Context context=new Context("");
        System.out.println(root.calculate(context));
    }
}
