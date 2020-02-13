package chess;

public class King extends Piece {
    public King (PieceColour c) {super(0,0,"\u2654",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.getBoard()[iFi][jFi].hasPiece())
            if (Board.getBoard()[iFi][jFi].getPiece().getColour()==colour)
                return false;
        if (Math.abs(iFi-iIn) <= 1 && Math.abs(jFi-jIn) <= 1)
            return true;
        return false;
    }

}
