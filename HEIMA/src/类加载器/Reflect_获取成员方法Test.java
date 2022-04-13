package 类加载器;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect_获取成员方法Test {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("类加载器.Student");
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getMethod("method1");
		m.invoke(obj);
		Method m2 = c.getMethod("method2", String.class);
		m2.invoke(obj, "xiaohong");
		Method m3 = c.getMethod("method3", String.class, int.class);
		Object o = m3.invoke(obj, "xiaohuang", 30);
		System.out.println((String) o);
		Method declaredMethod = c.getDeclaredMethod("function");
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(obj);
	}
}
