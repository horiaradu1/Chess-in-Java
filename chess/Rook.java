package chess;

public class Rook extends Piece {
    public Rook (PieceColour c) {super(0,0,"\u2656",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.hasPiece(iFi,jFi))
            if (Board.getBoard().getPiece(iFi,jFi).getColour()==colour)
                return false;
        if ((iFi == iIn) != (jFi == jIn))
            return true;
        return false;
    }

}
