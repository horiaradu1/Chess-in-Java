package chess;

public class Rook extends Piece {
    public Rook (PieceColour c) {super(0,0,"\u2656",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        return false;
    }

}
