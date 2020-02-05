package chess;

public class Knight extends Piece {
    public Knight (PieceColour c) {super(0,0,"\u2658",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        return false;
    }

}
