package appl;

import java.util.stream.Stream;

import jj.util.log.Log;

public class Application {

	public static void main(String[] args) {
		demoRepeat();
		demoStrip();
		demoLines();
		demoIsBlank();
		demoCharactorToString();
		demoIndent();
		demoTransform();
		demoFormatted();		
		demoStripIndent();
		demoTanslateEscapes();
	}
	
	static void demoRepeat() {
		Log.logMethodCall();
		String s1 = "Hello".repeat(5);
		System.out.println(s1);
		String s2 = "-".repeat(50);
		System.out.println(s2);
	}

	static void demoStrip() {
		Log.logMethodCall();
		// Impl von trim etwas anders als die von strip...
		System.out.println("'" + "  Hello  ".trim() + "'");
		System.out.println("'" + "  Hello  ".strip() + "'");
		System.out.println("'" + "  Hello  ".stripLeading() + "'");
		System.out.println("'" + "  Hello  ".stripTrailing() + "'");
	}

	static void demoLines() {
		Log.logMethodCall();
		String s = "red\ngreen\nblue";
		Stream<String> stream = s.lines();
		stream.forEach(System.out::println);
	}
	
	static void demoIsBlank() {
		Log.logMethodCall();
		System.out.println("".isBlank());
		System.out.println("   ".isBlank());
		System.out.println("   \n \t ".isBlank());
		System.out.println("   n t ".isBlank());
	}

	static void demoCharactorToString() {
		Log.logMethodCall();
		String s = Character.toString(65);
		System.out.println(s);  // A
	}
	
	static void demoIndent() {
		Log.logMethodCall();
		String s1 = "Hello";
		String s2 = s1.indent(8);
		System.out.println(s1);
		System.out.println(s2);
	}

	static void demoTransform() {
		Log.logMethodCall();
		String s = "3.14";
		double d1 = s.transform(str -> Double.parseDouble(str));
		System.out.println(d1);
		double d2 = s.transform(Double::parseDouble);
		System.out.println(d1);
	}
	
	static void demoFormatted() {
		Log.logMethodCall();
		String s = "alpha %s beta %d";
		String s1 = String.format(s, "Hello", 42);
		System.out.println(s1);
		String s2 = s.formatted("Hello", 42);
		System.out.println(s2);
	}

	static void demoStripIndent() {
		Log.logMethodCall();
		String s = "  alpha    \n    beta";
		System.out.println(s);
		System.out.println(s.stripIndent());
	}

	static void demoTanslateEscapes() {
		Log.logMethodCall();
		String s = "alpha    \\n  \\t   beta";
		System.out.println(s);
		System.out.println(s.translateEscapes());
	}

}

