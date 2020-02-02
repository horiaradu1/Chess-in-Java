package chess;

public class CheckInput {


	public boolean checkCoordinateValidity(String input) {
		if (input.length()!=2)
			return false;
		int a = Integer.parseInt(input.substring(0,1));
		int b = (int) input.charAt(1);
		if((a>=0 && a<=9) && (b>=97 && b<=104))
			return true;
		return false;
	}
}