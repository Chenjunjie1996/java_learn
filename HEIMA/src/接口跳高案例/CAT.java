package 接口跳高案例;

public class CAT extends ANIMAL implements Jummping {

	/**
	 * 
	 */
	public CAT() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public CAT(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}

	@Override
	public void jumpping() {
		System.out.println("猫跳高");
	}

}
