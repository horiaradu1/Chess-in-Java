package chess;

public class CheckInput {

	public boolean checkCoordinateValidity(String input) {
		return input.matches("[0-7][a-h]");
	}
}