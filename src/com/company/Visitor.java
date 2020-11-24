package com.company;

public interface Visitor {

    void visit(FisierTipTxt fisierTipTxt);
    void visit(FisierTipMp3 fisierTipMp3);
    void visit(FisierTipSvg fisierTipSvg);
    void visit(Director director);

}
