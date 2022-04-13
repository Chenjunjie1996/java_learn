package 接口跳高案例;

public abstract class ANIMAL {
	private String name;
	private int age;

	public ANIMAL() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public ANIMAL(String name, int age) {
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

	public abstract void eat();
}
