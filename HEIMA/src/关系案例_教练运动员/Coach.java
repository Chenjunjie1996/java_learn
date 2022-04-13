package 关系案例_教练运动员;

public abstract class Coach extends Person {

	/**
	 * 
	 */
	public Coach() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public Coach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("教练餐");
	}

	public abstract void teach();

}
