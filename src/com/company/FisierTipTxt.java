package com.company;

public class FisierTipTxt implements Element{

    private String name;
    private AlignStrategy alignStrategy;

    FisierTipTxt(String name){
        this.name=name;
    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }

}