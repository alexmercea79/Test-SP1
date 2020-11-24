package com.company;

public class FisierTipSvg implements Element{

    private String name;

    FisierTipSvg(String name){
        this.name=name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println(this.name);
    }
}
