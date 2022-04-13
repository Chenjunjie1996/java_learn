package 内部类;

public class Outer {

	private int num = 10;

	// 成员内部类
	private class Inner {
		private void show() {
			System.out.println(num);
		}
	}

	public void method() {
		// 访问内部类方法必须创建对象
		Inner I = new Inner();
		I.show();
	}

	// 局部内部类
	public void method1() {
		int num1 = 20;
		class Inner1 {
			public void show1() {
				System.out.println(num);
				System.out.println(num1);
			}
		}
		Inner1 I1 = new Inner1();
		I1.show1();
	}

	// 匿名内部类 是一个继承了该类或者实现了该接口的子类匿名对象
	public void method2() {
		Inter i = new Inter() {
			@Override
			public void show() {
				System.out.println("匿名内部类");
			}
		};
		i.show();
		i.show();
		i.show();
	}

}
