package 内部类;

// 外界无法直接访问，需要在方法内部创建对象并使用

//  CPU 是笔记本的内部类

// 成员内部类， 局部内部类

public class Demo {
	public static void main(String[] args) {
		/*
		 * Outer.Inner I = new Outer().new Inner(); I.show();
		 */
		Outer OT = new Outer();
		OT.method();

		Outer OT1 = new Outer();
		OT1.method1();

		Outer O2 = new Outer();
		O2.method2();
	}
}
