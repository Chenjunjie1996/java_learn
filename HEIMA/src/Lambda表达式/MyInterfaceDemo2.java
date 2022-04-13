package Lambda表达式;

public class MyInterfaceDemo2 extends MyInterImpl2 {
	public static void main(String[] args) {
		MyInterface2 my = new MyInterImpl2();
		my.show();
		my.show1();
		// 接口中静态方法只能通过接口名调用
		MyInterface2.show2();
	}
}
