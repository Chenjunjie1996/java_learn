package Lambda表达式;

public class MyStringDemo {
	public static void main(String[] args) {
		UseMyString((String s, int x, int y) -> {
			return s.substring(x, y);
		});

		UseMyString((s, x, y) -> s.substring(x, y));

		// 引用类中的实例方法
		UseMyString(String::substring);
	}

	private static void UseMyString(MyString my) {
		String s = my.mySubString("HelloWorld", 2, 5);
		System.out.println(s);
	}
}
