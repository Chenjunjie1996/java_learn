package 接口;

public interface Inter {
	public int num = 20;
	public final int num2 = 10;

	// public static final int num3 = 30; == int num3 = 30;

	// 接口中变量是常量 被静态修饰， 可以通过接口名直接访问

	// public void show() {};

	public abstract void method(); // 接口中方法必须是抽象的
}
