package 集合;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public int compareTo(Student s) {
		// return 0; // 重复元素不添加
		// return -1; // 倒序
		// return 1; // 正序
		int num = this.age - s.age;
		if (num == 0) {
			num = this.name.compareTo(s.name);
		}
		return num;
	}

}