package appl;

import jj.util.reflection.ClassInspector;

public class Application {
	public static void main(String[] args) {
		final Point p = new Point(3, 4);
		System.out.println(p);
		ClassInspector.inspect(Point.class);
	}
}
