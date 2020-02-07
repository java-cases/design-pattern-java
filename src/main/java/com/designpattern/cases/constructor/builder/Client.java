package com.designpattern.cases.constructor.builder;

import com.designpattern.cases.constructor.builder.impl.DELLComputerBuilder;
import com.designpattern.cases.constructor.builder.impl.HPComputerBuilder;

public class Client {

    public static void main(String[] args){
        buildComputer();
    }

    public static void buildComputer(){

        Director director=new Director();

        Builder computerBuilder1=new HPComputerBuilder();
        director.setBuilder(computerBuilder1);
        director.construct();

        Product pc1 =director.getProduct();

        Builder computerBuilder2=new DELLComputerBuilder();
        director.setBuilder(computerBuilder2);
        director.construct();

        Product pc2 =director.getProduct();
    }
}
