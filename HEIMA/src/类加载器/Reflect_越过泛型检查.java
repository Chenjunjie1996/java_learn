package 类加载器;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflect_越过泛型检查 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		Class<? extends ArrayList> c = array.getClass();
		Method m = c.getMethod("add", Object.class);
		m.invoke(array, "hello");
		m.invoke(array, "world");
		System.out.println(array);
	}
}
