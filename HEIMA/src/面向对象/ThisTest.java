package 面向对象;

public class ThisTest {
	private String name;
	private int age;

	public void setName(String name) {
		// 同名 this 成员变量
		this.name = name;
		// name = name 局部变量
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println(name + "," + age);
	}

	public static void main(String[] args) {
		ThisTest aThisTest = new ThisTest();
		aThisTest.setName("asd");
		aThisTest.setAge(13);
		aThisTest.show();
		System.out.println("name : " + aThisTest.getName() + ", " + "age : " + aThisTest.getAge());
	}
}
