package appl;

import jj.util.reflection.ClassInspector;

public class Application {
	public static void main(String[] args) {
		Point p = new Point(1, 2);
		System.out.println(p);
		ClassInspector.inspect(Point.class);
	}

}
