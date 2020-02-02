package chess;

public class Piece {
    private int row;
    private int column;
    private String symbol;
    protected PieceColour colour;

    public Piece(int row, int column, String symbol, PieceColour colour){
        this.row=row;
        this.column=column;
        this.symbol=symbol;
        this.colour=colour;
        if(this.colour==PieceColour.BLACK){ //Change piece colour
            int s = (int) symbol.charAt(0);
            s+=6;
            char var = (char) s;
            this.symbol = "";
            this.symbol += var;
        }

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public PieceColour getColour() {
        return colour;
    }

    public void updateCoordinates(int r, int c){
        this.row=r;
        this.column=c;
    }

    public boolean isLegitMove(int i, int j, int r, int c){return false;}
}
