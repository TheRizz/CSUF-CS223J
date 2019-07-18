
public enum PlayerSide {
	X('X'), O('O'), nan(' ');
	
	private char side;
	
	private PlayerSide(char sidef) {
		side = sidef;
	}
	
	public char getSide() {
		return side;
	}
	
}
