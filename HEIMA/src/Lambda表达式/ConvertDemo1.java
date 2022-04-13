package Lambda表达式;

public class ConvertDemo1 {
	public static void main(String[] args) {
		usePrinter((String s) -> {
			String result = s.toUpperCase();
			System.out.println(result);
		});
		usePrinter(s -> System.out.println(s.toUpperCase()));

		// 引用对象的实例方法
		Convert1 ct = new Convert1();
		usePrinter(ct::printUpper);
	}

	private static void usePrinter(Convert1Inter c) {
		c.printUpperCase("Hello");
	}
}
