package 关系案例_教练运动员;

public abstract class Player extends Person {

	/**
	 * 
	 */
	public Player() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public Player(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("运动员餐");
	}

	public abstract void learn();

}
