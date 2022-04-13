package 函数式接口;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		boolean b = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
		System.out.println(b);
	}

	private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//		boolean b1 = pre1.test(s);
//		boolean b2 = pre2.test(s);
//		boolean b = b1 && b2;
//		return b;

//		return pre1.and(pre2).test(s);   // 短路与
		return pre1.or(pre2).test(s); // 短路或
	}
}
