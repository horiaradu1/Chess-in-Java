package chess;

public class Queen extends Piece {
    public Queen (PieceColour c) {super(0,0,"\u2655",c);}

    public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (Board.getBoard()[iFi][jFi].hasPiece())
            if (Board.getBoard()[iFi][jFi].getPiece().getColour()==colour)
                return false;
            if (iFi == iIn)
                return Board.rowLineCheck(iIn, jIn, iFi, jFi);
            if (jFi == jIn)
                return Board.columnLineCheck(iIn, jIn, iFi, jFi);

            if ((iFi-iIn)==(jFi-jIn))
                return Board.mainDiagLineCheck(iIn, jIn, iFi, jFi);
            if ((iFi-iIn)==-(jFi-jIn))
                return Board.secDiagLineCheck(iIn, jIn, iFi, jFi);

        return false;
    }

}
