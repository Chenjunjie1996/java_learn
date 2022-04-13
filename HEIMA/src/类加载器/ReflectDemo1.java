package 类加载器;

// 反射或者构造方法

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("类加载器.Student");
		Constructor<?>[] cons = c.getConstructors();
		for (Constructor<?> constructor : cons) {
			System.out.println(constructor);
		}

		Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		System.out.println("==========");
		Constructor<?> constructor = c.getConstructor();
		System.out.println(constructor);
		Object obj = constructor.newInstance();
		System.out.println(obj);

	}
}
