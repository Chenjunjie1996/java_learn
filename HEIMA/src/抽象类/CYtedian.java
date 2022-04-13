package 抽象类;

//成员特点
public abstract class CYtedian {
	private int age = 20;
	private final String city = "BJ";

	// 不能直接创建实例对象 用于子类初始化
	public CYtedian() {
	}

	public CYtedian(int age) {
		this.age = age;
	}

	// 非抽象方法 提高代码复用性
	public void show() {
		age = 40;
		System.out.println(age);
		System.out.println(city);

	}

	// 抽象方法 限定子类必须重写方法
	public abstract void eat();
}
