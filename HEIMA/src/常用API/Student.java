package 常用API;

import java.util.Objects;

public class Student {

	private String name;
	private int age;

	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// this --- s1 OBJ ---s2

		// 比较地址
		if (this == obj)
			return true;

		// 判断参数是否为null， 判断两个对象是否来自同一个类
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// 向下转型
		Student other = (Student) obj;

		// 比较年龄和姓名
		return age == other.age && Objects.equals(name, other.name);
	};

}
