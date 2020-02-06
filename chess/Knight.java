package chess;

public class Knight extends Piece {
    public Knight (PieceColour c) {super(0,0,"\u2658",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.hasPiece(iFi,jFi))
            if (Board.getBoard().getPiece(iFi,jFi).getColour()==colour)
                return false;
        if ((Math.abs(iFi-iIn) == 2 && Math.abs(jFi-jIn) == 1) || (Math.abs(iFi-iIn) == 1 && Math.abs(jFi-jIn) == 2))
            return true;
        return false;

    }

}
