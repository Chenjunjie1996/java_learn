package Lambda表达式;

public class Lambda_Test1 {
	public static void main(String[] args) {
		EatableImpl e = new EatableImpl();
		e.eat();

		// 匿名内部类
		useEatable(new Eatable() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat1");
			}
		});
		// lambda
		useEatable(() -> {
			System.out.println("eat2");
		});
	}

	private static void useEatable(Eatable e) {
		e.eat();
	}
}
