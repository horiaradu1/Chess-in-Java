package chess;

public class Pawn extends Piece {
    public Pawn (PieceColour c) {super(0,0,"\u2659",c);}

	public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (colour == PieceColour.BLACK) {
            if (iFi==iIn+1 && (jFi==jIn-1 || jFi==jIn+1) && Board.hasPiece(iFi,jFi))
                if (Board.getBoard().getPiece(iFi,jFi).getColour() == PieceColour.WHITE)
                    return true;
            if (iFi==iIn+1 && jFi==jIn && !Board.hasPiece(iIn+1,jIn))
                return true;
            if (iIn==1 && iFi==iIn+2 && jFi==jIn && !Board.hasPiece(iIn+1,jIn) && !Board.hasPiece(iIn+2,jIn))
                return true;
        }
        else if (colour == PieceColour.WHITE){
            if (iFi==iIn-1 && (jFi==jIn-1 || jFi==jIn+1) && Board.hasPiece(iFi,jFi))
                if (Board.getBoard().getPiece(iFi,jFi).getColour() == PieceColour.BLACK)
                    return true;
            if (iFi==iIn-1 && jFi==jIn && !Board.hasPiece(iIn-1,jIn))
                return true;
            if (iIn==6 && iFi==iIn-2 && jFi==jIn && !Board.hasPiece(iIn-1,jIn) && !Board.hasPiece(iIn-2,jIn))
                return true;
        }
        return false;
    }
}
