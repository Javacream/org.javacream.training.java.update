package appl;

import jj.util.log.Log;

public class Application {
	public static void main(String[] args) {
		demoFallThrough();
		demoMultipleValues();
		demoArrow();
		demoSwitchReturnsResult();
		demoReturnType();
		demoVar();
	}

	static void demoFallThrough() {
		Log.logMethodCall();
		int day = 2;
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("workday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		}
	}

	static void demoMultipleValues() {
		Log.logMethodCall();
		int day = 2;
		switch (day) {
		case 1, 2, 3, 4, 5:
			System.out.println("workday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		}
	}

	static void demoArrow() {
		Log.logMethodCall();
		int day = 2;
		switch (day) {
		case 1, 2, 3, 4, 5 -> System.out.println("workday");
		case 6 -> { int i = 25; System.out.println("saturday" + i); }
		case 7 -> System.out.println("sunday");
		}
	}

	static void demoSwitchReturnsResult() {
		Log.logMethodCall();
		int result1 = calc1('+', 40, 2);
		System.out.println(result1);
		int result2 = calc2('+', 40, 2);
		System.out.println(result2);
		int result3 = calc3(Operator.PLUS, 40, 2);
		System.out.println(result3);
	}

	static int calc1(char op, int x, int y) {
		int result = switch (op) {
		case '+':
			yield x + y;
		case '-':
			yield x - y;
		case '*':
			yield x * y;
		case '/':
			yield x / y;
		default:
			throw new RuntimeException();
		};
		//...
		return result;
	}

	static int calc2(char op, int x, int y) {
		int result = switch (op) {
		case '+' -> x + y;
		case '-' -> x - y;
		case '*' -> x * y;
		case '/' -> x / y;
		default -> throw new RuntimeException();
		};
		// tu was mit result
		return result;
	}

	static enum Operator {
		PLUS, MINUS, TIMES, DIV
		/* , MOD */};

	static int calc3(Operator op, int x, int y) {
		return switch (op) {
		case PLUS -> x + y;
		case MINUS -> x - y;
		case TIMES -> x * y;
		case DIV -> x / y;
		};
	}

	static void demoReturnType() {
		Log.logMethodCall();
		int x = 2;
		Number n = switch (x) {
		// Double n = (double)switch (x) {
		case 1 -> 42;
		case 2 -> 77L;
		case 3 -> 3.14;
		default -> 0;
		};
		System.out.println(n + " " + n.getClass().getName());
	}

	static void demoVar() {
		Log.logMethodCall();
		int x = 2;
		var v = switch (x) {
		case 1 -> 42;
		case 2 -> 77L;
		case 3 -> 3.14;
		default -> 0;
		};
		Number n = v;
		System.out.println(n + " " + n.getClass().getName());
	}

	static void demoYieldInBlock() {
		Log.logMethodCall();
		int x = 2;
		int n = switch (x) {
		case 1 -> {
			System.out.println("do this...");
			yield 42;
		}
		case 2 -> {
			System.out.println("do that...");
			yield 77;
		}
		default -> {
			System.out.println("default...");
			yield 33;
		}
		};
		System.out.println(n);
	}
}