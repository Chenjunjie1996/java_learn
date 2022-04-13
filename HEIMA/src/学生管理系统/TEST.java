package 学生管理系统;

//  ALT + SHIFT +S
/**
 * @author CHEN JUNJIE
 *
 */
public class TEST {

	private String S_id;
	private String name;
	private String age;
	private String address;

	public TEST() {
	}

	/**
	 * @param s_id
	 * @param name
	 * @param age
	 * @param address
	 */
	public TEST(String s_id, String name, String age, String address) {
		super();
		S_id = s_id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getS_id() {
		return S_id;
	}

	public void setS_id(String s_id) {
		S_id = s_id;
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
