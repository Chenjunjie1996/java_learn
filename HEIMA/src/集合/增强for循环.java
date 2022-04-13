package 集合;

import java.util.ArrayList;
import java.util.List;

public class 增强for循环 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.println(i);
		}

		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");

		// 内部原理是迭代器
		for (String i : list) {
			System.out.println(i);
		}
	}
}
