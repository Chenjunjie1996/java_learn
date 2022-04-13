package 类加载器;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect_获取成员方法 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("类加载器.Student");
//		Method[] methods = c.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}

		Method[] methods2 = c.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		System.out.println("=============");

		Method m = c.getMethod("method1");
		System.out.println(m);
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		m.invoke(obj);

	}
}
