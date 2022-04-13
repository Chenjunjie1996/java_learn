package Lambda表达式;

public interface MyInterface {
	void show1();

	void show2();

	// 接口的升级
	default void show3() {
		System.out.println("show3");
	}
}
