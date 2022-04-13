package 函数式接口;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {
		String s = "linqingxia,30";
//		convert(s, ss -> ss.split(",")[1], i -> Integer.parseInt(i), ii -> ii + 70);
		// 方法引用
		convert(s, ss -> ss.split(",")[1], Integer::parseInt, i -> i + 70);
	}

	private static void convert(String s, Function<String, String> func1, Function<String, Integer> func2,
			Function<Integer, Integer> func3) {
		Integer i = func1.andThen(func2).andThen(func3).apply(s);
		System.out.println(i);
	}

}
