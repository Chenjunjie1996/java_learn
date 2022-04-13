package 排序2;

public class Student implements Comparable<Student> {
	private String username;
	private int age;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param age
	 */
	public Student(String username, int age) {
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}
