package chess;

public class Pawn extends Piece {
    public Pawn (PieceColour c) {super(0,0,"\u2659",c);}

	public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
 //       if (Board.hasPiece(iFi,jFi))
 //           if (Board.getPiece(iFi,jFi).getColour()==colour)
 //               return false;
        return true;
    }
}
