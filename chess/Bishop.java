package chess;

public class Bishop extends Piece {
    public Bishop (PieceColour c) {super(0,0,"\u2657",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        return false;
    }

}
