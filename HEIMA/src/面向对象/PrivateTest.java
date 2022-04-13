package 面向对象;

public class PrivateTest {
	String name;
	private int age;

	// get/ set 方法
	public void setAge(int a) {
		if (a < 0 || a > 120) {
			System.out.println("error");
		} else {
			age = a;
		}
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println(name + "," + age);
	}

	public static void main(String[] args) {
		PrivateTest aTest = new PrivateTest();
		aTest.name = "xh";
		aTest.setAge(10);
		aTest.show();
	}
}
