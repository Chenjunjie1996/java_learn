package 集合;

public class GenericTest<T> implements GenericInter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		// 泛型类
		Generic<String> g1 = new Generic<String>("1");
		Generic<Integer> g2 = new Generic<Integer>(1);
		Generic<Double> g3 = new Generic<Double>(1.0);
		System.out.println(g1.getKeyT() + "," + g2.getKeyT() + "," + g3.getKeyT());

		// 泛型方法
		g1.show("1");
		g2.show(1.0);
		g3.show(true);

		// 泛型接口
		GenericInter<String> G = new GenericTest<String>();
		G.show("111");

		GenericInter<String> G1 = new GenericInter<String>() {

			@Override
			public void show(String t) {
				System.out.println(3.14);
			}
		};
		G1.show("3.14");
	}
}
