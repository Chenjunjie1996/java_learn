package 类加载器;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflect_获取成员变量Test {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> c = Class.forName("类加载器.Student");
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		Field addressField = c.getField("address");
		Field ageField = c.getDeclaredField("age");
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		addressField.set(obj, "uk");
		ageField.set(obj, 66);
		nameField.set(obj, "xiaohong");
		System.out.println(obj);
	}
}
