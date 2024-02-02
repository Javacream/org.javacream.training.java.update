package appl;

public enum OperatorSymbol {
	plus('+'),
	minus('-'),
	times('*'),
	div('/');
	
	private final char value;
	private OperatorSymbol(char value) {
		this.value = value;
	}
	public char value() {
		return this.value;
	}
}
