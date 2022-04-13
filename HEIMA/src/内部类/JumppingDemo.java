package 内部类;

public class JumppingDemo {
	public static void main(String[] args) {
		JumppingOper jo = new JumppingOper();
		Jumpping j = new JumppingZi();
		jo.method(j);

		System.out.println("-------");

		// 匿名内部类 不需要多写类
		jo.method(new Jumpping() {
			@Override
			public void Jump() {
				System.out.println("cat can jump");
			}
		});

		jo.method(new Jumpping() {

			@Override
			public void Jump() {
				System.out.println("dog can jump");
			}
		});
	}
}
