package 面向对象;

public class 构造方法 {
	private String name;
	private int age;

	// 建议 无论是否使用，都提供无参构造方法
	public 构造方法() {
	}

	// 定义了构造方法系统不再提供默认的构造方法
	public 构造方法(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("name : " + name + ", " + "age : " + age);
	}

	public static void main(String[] args) {
		构造方法 a构造方法 = new 构造方法("gou", 30);
		a构造方法.show();

	}
}
