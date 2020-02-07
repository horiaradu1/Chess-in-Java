package chess;

public class Rook extends Piece {
    public Rook (PieceColour c) {super(0,0,"\u2656",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.getBoard()[iFi][jFi].hasPiece())
            if (Board.getBoard()[iFi][jFi].getPiece().getColour()==colour)
                return false;
        if ((iFi == iIn) != (jFi == jIn))
            if (iFi == iIn)
                return Board.rowLineCheck(iIn, jIn, iFi, jFi);
            if (jFi == jIn)
                return Board.columnLineCheck(iIn, jIn, iFi, jFi);
        return false;
    }

}
