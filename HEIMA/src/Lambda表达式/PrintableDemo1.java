package Lambda表达式;

public class PrintableDemo1 {
	public static void main(String[] args) {
		usePrintable(i -> System.out.println(i));
		usePrintable(System.out::println);
	}

	private static void usePrintable(Printable1 p) {
		p.printInt(666);
	}
}
