package 接口跳高案例;

public class DOG extends ANIMAL implements Jummping {

	/**
	 * 
	 */
	public DOG() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public DOG(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");
		;
	}

	@Override
	public void jumpping() {
		System.out.println("狗跳高");
	}

}
