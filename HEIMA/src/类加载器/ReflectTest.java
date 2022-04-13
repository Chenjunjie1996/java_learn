package 类加载器;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("类加载器.Student");
		Constructor<?> constructor = c.getConstructor(String.class, int.class, String.class);
		Object obj = constructor.newInstance("a", 1, "b");
		System.out.println(obj);
	}
}
