package 多态案例;

public class Demo {
	public static void main(String[] args) {
		Animal A = new Cat();
		A.setAge(5);
		A.setName("coffee");
		System.out.println(A.getName() + ", " + A.getAge());
		A.eat();

		Animal B = new Cat("大飞", 2);
		System.out.println(B.getName() + ", " + B.getAge());
		B.eat();
	}
}
