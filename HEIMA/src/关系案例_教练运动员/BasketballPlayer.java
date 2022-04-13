package 关系案例_教练运动员;

public class BasketballPlayer extends Player implements LearnEng {

	/**
	 * 
	 */
	public BasketballPlayer() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public BasketballPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learnEng() {
		System.out.println("Basketball player should learn English");
	}

	@Override
	public void learn() {
		System.out.println("学篮球");
	}
}
