package chess;

public class Pawn extends Piece {
    public Pawn (PieceColour c) {super(0,0,"\u2659",c);}

	public boolean isLegitMove(int iIn, int jIn, int iFi, int jFi){
        if (colour == PieceColour.BLACK) {
            if (iFi==iIn+1 && (jFi==jIn-1 || jFi==jIn+1) && Board.getBoard()[iFi][jFi].hasPiece())
                if (Board.getBoard()[iFi][jFi].getPiece().getColour() == PieceColour.WHITE)
                    return true;
            if (iFi==iIn+1 && jFi==jIn && !Board.getBoard()[iIn+1][jIn].hasPiece())
                return true;
            if (iIn==1 && iFi==iIn+2 && jFi==jIn && !Board.getBoard()[iIn+1][jIn].hasPiece() && !Board.getBoard()[iIn+2][jIn].hasPiece())
                return true;
        }
        else if (colour == PieceColour.WHITE){
            if (iFi==iIn-1 && (jFi==jIn-1 || jFi==jIn+1) && Board.getBoard()[iFi][jFi].hasPiece())
                if (Board.getBoard()[iFi][jFi].getPiece().getColour() == PieceColour.BLACK)
                    return true;
            if (iFi==iIn-1 && jFi==jIn && !Board.getBoard()[iIn-1][jIn].hasPiece())
                return true;
            if (iIn==6 && iFi==iIn-2 && jFi==jIn && !Board.getBoard()[iIn-1][jIn].hasPiece() && !Board.getBoard()[iIn-2][jIn].hasPiece())
                return true;
        }
        return false;
    }
}
