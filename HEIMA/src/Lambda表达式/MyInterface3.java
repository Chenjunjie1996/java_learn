package Lambda表达式;

public interface MyInterface3 {
	default void show1() {
		show();
		System.out.println("show1");
	}

	default void show2() {
		show();
		System.out.println("show2");
	}

	static void method1() {
		show0();
		System.out.println("method1");
	}

	static void method2() {
		show0();
		System.out.println("method2");
	}

	private void show() {
		System.out.println("private");
	}

	private static void show0() {
		System.out.println("private static");
	}
}
