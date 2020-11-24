package com.company;

public class Fisier {
    public String name;
    public String tip;

    @Override
    public String toString() {
        return "Fisier{" +
                "name='" + name + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }

    public Fisier(String name, String tip){
        this.name=name;
        this.tip=tip;
    }
}
