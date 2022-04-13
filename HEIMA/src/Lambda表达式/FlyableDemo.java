package Lambda表达式;

public class FlyableDemo {
	public static void main(String[] args) {
		useFlyable(new Flyable() {

			@Override
			public void fly(String s) {
				System.out.println("plane");
				System.out.println(s);
			}
		});

		// lambda
		useFlyable((String s) -> {
			System.out.println("fly");
			System.out.println(s);
		});
		// 省略
		useFlyable(s -> System.out.println(s));
	}

	private static void useFlyable(Flyable f) {
		f.fly("flyable");
	}
}
