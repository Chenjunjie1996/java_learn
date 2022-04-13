package Stream流;

public class Person {
	private String name; // 姓名
	private int salary; // 薪资
	private int age;
	private String sex; // 性别
	private String area; // 地区

	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param salary
	 * @param age
	 * @param sex
	 * @param area
	 */
	public Person(String name, int salary, int age, String sex, String area) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", age=" + age + ", sex=" + sex + ", area=" + area + "]";
	}

}
