package 类加载器;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflect_获取成员变量 {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("类加载器.Student");
		Field[] filelds = c.getFields();
		for (Field field : filelds) {
			System.out.println(field);
		}

		Field[] declaredFields = c.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}
		System.out.println("========");

		Field addressField = c.getField("address");
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		addressField.set(obj, "xian");
		System.out.println(obj);

		Field ageField = c.getDeclaredField("age");
		ageField.set(obj, 10);
		System.out.println(obj);

		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "xiaohong");
		System.out.println(obj);
	}
}
