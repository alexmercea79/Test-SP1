package com.company;

import java.util.ArrayList;

public class Director implements Element {
    private String name;
    public ArrayList<Element> directoare=new ArrayList<>();
    public Director(String name){
        this.name=name;
    }
    public void addDirector(Element dir){
        directoare.add(dir);
    }
    public void accept(Visitor v){

        v.visit(this);
        for(Element i:directoare){
            i.accept(v);
        }}
        public void print(){
            System.out.println("Directorul: "+this.name+" contine fisierele:");
            for(Element i:directoare){
                i.print();
            }
        }

    }



