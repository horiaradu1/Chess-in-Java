package chess;

public class Bishop extends Piece {
    public Bishop (PieceColour c) {super(0,0,"\u2657",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.getBoard()[iFi][jFi].hasPiece())
            if (Board.getBoard()[iFi][jFi].getPiece().getColour()==colour)
                return false;
        if (Math.abs(iFi-iIn) == Math.abs(jFi-jIn))
            if (iFi-iIn==jFi-jIn)
                return Board.mainDiagLineCheck(iIn, jIn, iFi, jFi);
            if (iFi-iIn==-(jFi-jIn))
                return Board.secDiagLineCheck(iIn, jIn, iFi, jFi);
        return false;
    }

}
