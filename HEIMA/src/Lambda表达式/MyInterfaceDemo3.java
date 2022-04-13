package Lambda表达式;

/*
默认方法可以调用私有的静态和非静态方法
静态方法只能调用私有的静态方法
 */
public class MyInterfaceDemo3 {
	public static void main(String[] args) {
		MyInterface3 my = new MyInterFaceImpl3();
		my.show1();
		my.show2();
		MyInterface3.method1();
		MyInterface3.method2();
	}
}
