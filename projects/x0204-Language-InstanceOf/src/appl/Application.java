package appl;

import jj.util.log.Log;


public class Application {
	public static void main(String[] args) {
		demoOldFashion();
		demoNewFashion();
	}

	static void demoOldFashion() {
		Log.logMethodCall();
		Alpha alpha = new Gamma(1, 2, 3);
		if (alpha instanceof Gamma) { 
			Gamma gamma = (Gamma) alpha;
			System.out.println(gamma.a + " " + gamma.b + " " + gamma.c);
		}
		else if (alpha instanceof Beta) {
			Beta beta = (Beta) alpha;
			System.out.println(beta.a + " " + beta.b);
		}
		else if (alpha instanceof Alpha) {
			System.out.println(alpha.a);
		}
	}

	static void demoNewFashion() {
		Log.logMethodCall();
		Alpha alpha = new Gamma(1, 2, 3);
		if (alpha instanceof Gamma gamma) {
			System.out.println(gamma.a + " " + gamma.b + " " + gamma.c);
		}
		else if (alpha instanceof Beta beta) {
			System.out.println(beta.a + " " + beta.b);
		}
		else if (alpha instanceof Alpha) {
			System.out.println(alpha.a);
		}
	}
}
