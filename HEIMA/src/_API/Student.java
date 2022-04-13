package _API;

// 学生类
public class Student {
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
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
}
