package chess;

public class Queen extends Piece {
    public Queen (PieceColour c) {super(0,0,"\u2655",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        return false;
    }

}
