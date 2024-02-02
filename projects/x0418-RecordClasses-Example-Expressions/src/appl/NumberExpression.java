package appl;

public record NumberExpression(int value) implements Expression{
	@Override
	public int evaluate() {
		return this.value;
	}
}

