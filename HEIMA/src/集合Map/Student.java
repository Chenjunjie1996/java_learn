package 集合Map;

import java.util.Objects;

public class Student {
	private String name;
	private String student_id;
	private int age;

	/**
	 * @param name
	 * @param student_id
	 * @param age
	 */
	public Student(String name, String student_id, int age) {
		this.name = name;
		this.student_id = student_id;
		this.age = age;
	}

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", student_id=" + student_id + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, student_id);
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
		return age == other.age && Objects.equals(name, other.name) && student_id == other.student_id;
	}

}
