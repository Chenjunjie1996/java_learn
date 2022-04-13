package Lambda表达式;

public class AddableDemo {
	public static void main(String[] args) {
		// 匿名内部类
		useAddable(new Addable() {

			@Override
			public int add(int x, int y) {
				return x + y;
			}
		});
		// lambda
		useAddable((int x, int y) -> {
			return x + y;
		});
		// 省略
		useAddable((x, y) -> x + y);
	}

	private static void useAddable(Addable a) {
		int num = a.add(60, 60);
		System.out.println(num);
	}
}
