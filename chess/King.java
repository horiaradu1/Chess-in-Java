package chess;

public class King extends Piece {
    public King (PieceColour c) {super(0,0,"\u2654",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        return false;
    }

}
