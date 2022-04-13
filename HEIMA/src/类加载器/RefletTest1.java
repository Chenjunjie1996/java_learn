package 类加载器;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 暴力反射

public class RefletTest1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("类加载器.Student");
		Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class);
		declaredConstructor.setAccessible(true);
		Object obj = declaredConstructor.newInstance("lin");
		System.out.println(obj);
	}
}
