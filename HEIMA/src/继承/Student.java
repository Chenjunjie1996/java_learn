package 继承;

public class Student extends Person {

	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public void learn() {
		System.out.println("learn knowledge");
	}
}
