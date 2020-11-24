package com.company;

public class Main {

    public static void main(String[] args) {
        Director director1=new Director("Directorul1");
        Director director2=new Director("Directorul2");
        FisierTipTxt fisier_tip_txt1=new FisierTipTxt("fisier tip txt1");
        fisier_tip_txt1.setAlignStrategy(new AlignLeft());
        fisier_tip_txt1.setAlignStrategy(new AlignRight());
        fisier_tip_txt1.setAlignStrategy(new AlignCenter());
        director1.addDirector(director2);
        director2.addDirector(fisier_tip_txt1);
        FisierTipMp3 mp3=new FisierTipMp3("music");
        FisierTipSvg svg=new FisierTipSvg("svg");
        director2.addDirector(mp3);
        director1.addDirector(svg);
        FisierTipTxt fisier_tip_txt2=new FisierTipTxt("fisier tip txt2");
        fisier_tip_txt2.setAlignStrategy(new AlignCenter());
        director2.addDirector(fisier_tip_txt2);
        director1.print();

        Marime marime1=new Marime();
        director1.accept(marime1);
        marime1.printMarime();
    }
}