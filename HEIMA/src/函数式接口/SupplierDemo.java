package 函数式接口;

// 生产型接口 Supplier

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		String s = getString(() -> "xiaolin");
		System.out.println(s);
		Integer i = getInteger(() -> 1);
		System.out.println(i);
	}

	private static String getString(Supplier<String> sup) {
		return sup.get();
	}

	private static Integer getInteger(Supplier<Integer> sup1) {
		return sup1.get();
	}
}
