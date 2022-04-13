package 关系案例_教练运动员;

public class BasketCoach extends Coach implements LearnEng {

	/**
	 * 
	 */
	public BasketCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public BasketCoach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learnEng() {
		System.out.println("Basketball Coach should learn English");
	}

	@Override
	public void teach() {
		System.out.println("教篮球");
	}

}
