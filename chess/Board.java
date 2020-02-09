package chess;


//This class is partially implemented. Some methods need to have their body written, some other are fine as they are and other may need to be extended. 

public class Board {
	private static Square [][] board = new Square[8][8];

	public Board(){
		for (int i=0; i<board[0].length; i++){
			for (int j=0; j<board[1].length; j++)
					board[i][j]=new Square(i,j);
		}		
	}	

	public static Square[][] getBoard(){
		return board;
	}
	
	public void initialisePieces(){
		//Black pieces
		setPiece(0,0,new Rook(PieceColour.BLACK));
		setPiece(0,1,new Knight(PieceColour.BLACK));
		setPiece(0,2,new Bishop(PieceColour.BLACK));
		setPiece(0,3,new Queen(PieceColour.BLACK));
		setPiece(0,4,new King(PieceColour.BLACK));
		setPiece(0,5,new Bishop(PieceColour.BLACK));
		setPiece(0,6,new Knight(PieceColour.BLACK));
		setPiece(0,7,new Rook(PieceColour.BLACK));
		setPiece(1,0,new Pawn(PieceColour.BLACK));
		setPiece(1,1,new Pawn(PieceColour.BLACK));
		setPiece(1,2,new Pawn(PieceColour.BLACK));
		setPiece(1,3,new Pawn(PieceColour.BLACK));
		setPiece(1,4,new Pawn(PieceColour.BLACK));
		setPiece(1,5,new Pawn(PieceColour.BLACK));
		setPiece(1,6,new Pawn(PieceColour.BLACK));
		setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		setPiece(6,0,new Pawn(PieceColour.WHITE));
		setPiece(6,1,new Pawn(PieceColour.WHITE));
		setPiece(6,2,new Pawn(PieceColour.WHITE));
		setPiece(6,3,new Pawn(PieceColour.WHITE));
		setPiece(6,4,new Pawn(PieceColour.WHITE));
		setPiece(6,5,new Pawn(PieceColour.WHITE));
		setPiece(6,6,new Pawn(PieceColour.WHITE));
		setPiece(6,7,new Pawn(PieceColour.WHITE));
		setPiece(7,0,new Rook(PieceColour.WHITE));
		setPiece(7,1,new Knight(PieceColour.WHITE));
		setPiece(7,2,new Bishop(PieceColour.WHITE));
		setPiece(7,3,new Queen(PieceColour.WHITE));
		setPiece(7,4,new King(PieceColour.WHITE));
		setPiece(7,5,new Bishop(PieceColour.WHITE));
		setPiece(7,6,new Knight(PieceColour.WHITE));
		setPiece(7,7,new Rook(PieceColour.WHITE));

	}

	public void printBoard(){
		System.out.print("\n  a b c d e f g h \n");
		System.out.print("  -----------------\n");
		String wsp=" ";String bar="|";

		for (int i=0; i<board[0].length; i++){
			int row=i+1;
				for (int j=0; j<board[1].length; j++){
					if ((j==0) && board[i][j].hasPiece())
						System.out.print(row+" " + board[i][j].getPiece().getSymbol()); //CHANGED
					else if ((j==0) && !board[i][j].hasPiece())
						System.out.print(row+"  " );
					else if (board[i][j].hasPiece())
						System.out.print("|" + board[i][j].getPiece().getSymbol());
					else
						System.out.print("| ");
				}
				System.out.print("  "+row+"\n");
		}
		System.out.print("  -----------------");
		System.out.print("\n  a b c d e f g h \n");

	}


	public boolean movePiece(int i0, int j0, int i1, int j1, Piece p){
		if (board[i1][j1].hasPiece()){
			if (board[i1][j1].getPiece().getSymbol().charAt(0)=='♔' || board[i1][j1].getPiece().getSymbol().charAt(0)=='♚'){
				return true;
			}
		}
		board[i0][j0].removePiece();
		setPiece(i1, j1, p);

		return false;
	}

	public void setPiece(int iIn, int jIn, Piece p){
		board[iIn][jIn].setPiece(p);
		board[iIn][jIn].getPiece().updateCoordinates(iIn, jIn);
	}

	public Piece getPiece(int iIn, int jIn){
		return board[iIn][jIn].getPiece();
	}
	
	public boolean hasPiece(int i, int j){
		if (board[i][j].hasPiece())
			return true;
		return false;
	}

	public static boolean rowLineCheck (int iIn, int jIn, int iFi, int jFi){
		if (jIn > jFi){
			int a;
			a=jIn;
			jIn=jFi;
			jFi=a;
		}
		for (int i=jIn+1; i<jFi; i++)
			if (Board.getBoard()[iIn][i].hasPiece())
				return false;
		return true;
	}

	public static boolean columnLineCheck (int iIn, int jIn, int iFi, int jFi){
		if (iIn > iFi){
			int a;
			a=iIn;
			iIn=iFi;
			iFi=a;
		}
		for (int i=iIn+1; i<iFi; i++)
			if (Board.getBoard()[i][jIn].hasPiece())
				return false;
		return true;
	}

	public static boolean mainDiagLineCheck (int iIn, int jIn, int iFi, int jFi){
		if (iIn > iFi){
			int a,b;
			a=iIn;
			iIn=iFi;
			iFi=a;
			b=jIn;
			jIn=jFi;
			jFi=b;
		}
		for (int i=1; i<(iFi-iIn); i++)
			if (Board.getBoard()[iIn+i][jIn+i].hasPiece())
				return false;
		return true;
	}

	public static boolean secDiagLineCheck (int iIn, int jIn, int iFi, int jFi){
		if (iIn > iFi){
			int a,b;
			a=iIn;
			iIn=iFi;
			iFi=a;
			b=jIn;
			jIn=jFi;
			jFi=b;
		}
		for (int i=1; i<(iFi-iIn); i++)
		if (Board.getBoard()[iIn+i][jIn-i].hasPiece())
			return false;
		return true;
	}
}
