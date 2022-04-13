package 集合Map;

import java.util.Objects;

public class StudentCs {
	private String name;
	private int age;

	/**
	 * 
	 */
	public StudentCs() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public StudentCs(String name, int age) {
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
		StudentCs other = (StudentCs) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "StudentCs [name=" + name + ", age=" + age + "]";
	}

}
