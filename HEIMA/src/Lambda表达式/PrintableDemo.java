package Lambda表达式;

// 方法引用  :: 引用符
public class PrintableDemo {
	public static void main(String[] args) {
		usePrintable(s -> System.out.println(s));
		usePrintable(System.out::println);

	}

	private static void usePrintable(Printable p) {
		System.out.println("print");
	}

}
