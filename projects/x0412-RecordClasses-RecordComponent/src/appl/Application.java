package appl;

import java.lang.reflect.RecordComponent;

public class Application {
	public static void main(String[] args) throws Exception {
		final Foo foo = new Foo(42, "Hello");
		//ClassInspector.inspect(Foo.class);
		System.out.println("isRecord: " + Foo.class.isRecord());
		System.out.println("recordComponents:");
		for (RecordComponent component : Foo.class.getRecordComponents()) {
			final Object value = component.getAccessor().invoke(foo);
			System.out.println("\t" + component.getName() + " = " + value);
		}
//		for(Method m : Foo.class.getMethods()) {
//			if(m.getParameterCount() != 0)
//				continue;
//			if (m.getDeclaringClass() == Object.class)
//				continue;
//			Object result = m.invoke(foo);
//			System.out.println(m.getName() + " " + result);
//			
//		}
	}
}
