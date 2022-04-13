package 字符字节流_集合到文件;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
	private static final long serialVersionUID = 42L;
	private String name;
	private String sid;
	private transient String age;
	private String add;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param sid
	 * @param age
	 * @param add
	 */
	public Student(String name, String sid, String age, String add) {
		this.name = name;
		this.sid = sid;
		this.age = age;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, age, name, sid);
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
		return Objects.equals(add, other.add) && Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(sid, other.sid);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", age=" + age + ", add=" + add + "]";
	}

}
