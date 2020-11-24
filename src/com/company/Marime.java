package com.company;

public class Marime implements Visitor{

    int marimeSVG =0, marimeTXT =0, marimeMP3 =0, marimeTotala =0,directoare=0;

    public void visit(FisierTipTxt fisierTiptxt) {
        marimeTotala +=5;
        marimeTXT +=5;
    }
    public void visit(FisierTipMp3 fisierTipmp3) {
        marimeTotala +=3000;
        marimeMP3 +=3000;
    }
    public void visit(FisierTipSvg fisierTipsvg) {
        marimeTotala +=45;
        marimeSVG +=45;
    }

    public void visit(Director director){
        directoare++;
    }

    public void printMarime(){
        System.out.println("\n Marimea fisierelor: "+ marimeTotala +" Kb, "+directoare+" directoare. \n " +
                "Marime fisier TXT: "+ marimeTXT +" Kb, Marime fisier SVG: "+ marimeSVG +" Kb, Marime fisier MP3: "+ marimeMP3);
    }

}
