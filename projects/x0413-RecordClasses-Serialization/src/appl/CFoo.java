package appl;

import java.io.IOException;
import java.io.Serializable;

public class CFoo implements Serializable {
	private int a;
	private String b; 
	public CFoo(int a, String b) {
		System.out.println("CFoo");
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "CFoo [a=" + a + ", b=" + b + "]";
	}
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		System.out.println(">> writeObject");
		out.writeInt(2 * a);
		out.writeObject(b + b);
	}
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("<< readObject");
		this.a = in.readInt();
		this.b = (String)in.readObject();
	}
}
