package Lambda表达式;

public interface MyInterface2 {
	void show();

	default void show1() {
		System.out.println("默认方法");
	}

	public static void show2() {
		System.out.println("静态方法");
	}
}
