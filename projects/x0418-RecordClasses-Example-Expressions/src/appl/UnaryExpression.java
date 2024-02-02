package appl;

public record UnaryExpression(Expression inner, UnaryOperator op) implements Expression{
	// "  -2 +43
	@Override
	public int evaluate() {
		return op.apply(this.inner.evaluate());
	}
}
