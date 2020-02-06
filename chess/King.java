package chess;

public class King extends Piece {
    public King (PieceColour c) {super(0,0,"\u2654",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.hasPiece(iFi,jFi))
            if (Board.getBoard().getPiece(iFi,jFi).getColour()==colour)
                return false;
        if (Math.abs(iFn-iIn) <= 1 && Math.abs(jFn-jIn) <= 1 )
            return true;
        return true;
    }

}
