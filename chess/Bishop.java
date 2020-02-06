package chess;

public class Bishop extends Piece {
    public Bishop (PieceColour c) {super(0,0,"\u2657",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.hasPiece(iFi,jFi))
            if (Board.getBoard().getPiece(iFi,jFi).getColour()==colour)
                return false;
        if (Math.abs(iFi-iIn) == Math.abs(jFi-jIn))
            return true;
        return false;
    }

}
