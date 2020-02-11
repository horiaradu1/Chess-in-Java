package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;
	private static PieceColour turn=PieceColour.WHITE;
	private static int[] inLoc;
	private static Piece piece;
	private static String initialInput;
	private static String finalInput;



	public Game(){
		Board b = new Board();
		b.initialisePieces();
		b.printBoard();
		while (!gameEnd){
			//write the game logic
			if (turn == PieceColour.WHITE)
				System.out.println("------ White moves ------");
			else System.out.println("------ Black moves ------");
			System.out.println("> Enter origin:");
			initialInput = System.console().readLine();
			if (CheckInput.checkCoordinateValidity(initialInput)){
				int[] inLoc = changeInput(initialInput);
				if (Board.getBoard()[inLoc[0]][inLoc[1]].hasPiece() && Board.getBoard()[inLoc[0]][inLoc[1]].getPiece().getColour() == turn){
					piece = Board.getBoard()[inLoc[0]][inLoc[1]].getPiece();
					System.out.println("> Enter destination:");
					finalInput = System.console().readLine();
					if (CheckInput.checkCoordinateValidity(finalInput)){
						int[] fnLoc = changeInput(finalInput);
						if (piece.isLegitMove(inLoc[0],inLoc[1],fnLoc[0],fnLoc[1])){
							if (b.movePiece(inLoc[0],inLoc[1],fnLoc[0],fnLoc[1],piece)){
								if (turn == PieceColour.WHITE)
									System.out.println("------ ! White wins ! ------");
								else
									System.out.println("------ ! Black wins ! ------");
								gameEnd=true;
							}
							else{
								if (turn == PieceColour.WHITE)
									turn = PieceColour.BLACK;
								else turn = PieceColour.WHITE;
								b.printBoard();
							}
						}
						else {b.printBoard(); System.out.println("! Illegitimate move !");}
					}
					else {b.printBoard(); System.out.println("! This is not a valid piece location !");}
				}
				else {b.printBoard(); System.out.println("! There is no piece there or the colour is wrong !");}
			}
			else {b.printBoard(); System.out.println("! This is not a valid piece location !");}
		}
	}
	
	
	public static void main (String args[]){
		Game g  = new Game();
	}

	public static int[] changeInput(String input){
		int i = Integer.parseInt(input.substring(0,1));
		int j = (int) input.charAt(1);
		int[] a = {i-1,j-97};
		return a;

	}
}
