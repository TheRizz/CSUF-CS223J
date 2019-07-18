
public enum RhFactor {
	POSITIVE('+'), NEGATIVE('-');
	
	private char sign;
	
	private RhFactor(char signf) {
		sign = signf;
	}
	
	public char getSign() {
		return sign;
	}
	
}
