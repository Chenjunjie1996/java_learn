package Lambda表达式;

public class ConvertDemo {
	public static void main(String[] args) {
		useConvert((String s) -> {
			return Integer.parseInt(s);
		});
		useConvert(s -> Integer.parseInt(s));

		// 引用类方法
		useConvert(Integer::parseInt);
	}

	private static void useConvert(Convert t) {
		int num = t.convert("123");
		System.out.println(num);
	}
}
