package 集合;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class 可变参数 {
	public static void main(String[] args) {
		System.out.println(sum(10, 20, 30, 40));

		// 返回固定大小列表 不允许增删add remove
		List<?> list = Arrays.asList("Hello", 3.14, true);
		System.out.println(list);

		// 不可变列表
		List<?> list1 = List.of("hello", "world", "python");
		System.out.println(list1);

		// 不可变集合
		Set<?> set = Set.of("Hello", "java");
		System.out.println(set);

	}

	public static int sum(int b, int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
