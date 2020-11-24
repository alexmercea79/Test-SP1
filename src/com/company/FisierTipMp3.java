package com.company;

public class FisierTipMp3 implements Element{

    private String name;

    FisierTipMp3(String name){
        this.name=name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println(this.name);
    }
}
