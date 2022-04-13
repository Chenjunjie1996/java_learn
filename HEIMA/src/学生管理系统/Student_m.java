package 学生管理系统;

public class Student_m {

	private String S_id;
	private String name;
	private String age;
	private String address;

	public Student_m() {
	}

	public Student_m(String s_id, String name, String age, String address) {
		this.S_id = s_id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getID() {
		return S_id;
	}

	public void setID(String S_id) {
		this.S_id = S_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
