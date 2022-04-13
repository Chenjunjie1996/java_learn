package 继承;

public class Teacher extends Person {

	public Teacher() {
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("teach students");
	}
}
