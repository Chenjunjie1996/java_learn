package 函数式接口;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		convert("123", s -> Integer.parseInt(s));
		convert("456", Integer::parseInt);

		convert1(123, i -> String.valueOf(i + 100));

		convert2("789", s -> Integer.parseInt(s), i -> String.valueOf(i + 566));
	}

	// 字符串转为int
	private static void convert(String s, Function<String, Integer> func) {
		Integer i = func.apply(s);
		System.out.println(i);
	}

	// int 加上一个整数 字符串输出
	private static void convert1(Integer i, Function<Integer, String> func) {
		String s = func.apply(i);
		System.out.println(s);
	}

	// 字符串转为int 加上一个整数 转为字符串输出
	private static void convert2(String s, Function<String, Integer> func1, Function<Integer, String> func2) {
//		Integer i = func1.apply(s);
//		String ss = func2.apply(i);
//		System.out.println(ss);
		String ss = func1.andThen(func2).apply(s);
		System.out.println(ss);
	}
}
