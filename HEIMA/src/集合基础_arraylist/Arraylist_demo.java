package 集合基础_arraylist;

import java.util.ArrayList;

public class Arraylist_demo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		// 增 add
		array.add("Hello");
		array.add("JAVA");
		array.add("python");
		array.add(1, "World");
		System.out.println(array);

		// 删 remove
		System.out.println(array.remove(0));
		System.out.println(array.remove("World"));
		System.out.println(array);

		// 改 set
		array.set(1, "C++");
		System.out.println(array);

		// 查 get size
		System.out.println(array.get(0));
		System.out.println(array.size());
	}
}
