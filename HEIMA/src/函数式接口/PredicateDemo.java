package 函数式接口;

import java.util.function.Predicate;

// negate  test
// 判断 返回布尔值
public class PredicateDemo {
	public static void main(String[] args) {
		boolean b1 = checkString("HELLO", s -> s.length() > 8);
		System.out.println(b1);
		boolean b2 = checkString("HELLOWORLD", s -> s.length() > 8);
		System.out.println(b2);
		boolean b3 = checkString_rev("HELLO", s -> s.length() > 8);
		System.out.println(b3);
		boolean b4 = checkString_rev("HELLOWORLD", s -> s.length() > 8);
		System.out.println(b4);
	}

	private static boolean checkString(String s, Predicate<String> pre) {
		return pre.test(s);
	}

	private static boolean checkString_rev(String s, Predicate<String> pre) {
//		return !pre.test(s);
		return pre.negate().test(s);
	}
}
