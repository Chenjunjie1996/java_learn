package 函数式接口;

import java.util.function.Consumer;

// 消费字符串

public class ConsumerDemo {
	public static void main(String[] args) {
		operatorString("xiaoh", (s -> System.out.println(s)));
		// 方法引用
		operatorString("xiaoh", System.out::println);

		// 反转
		operatorString("xiaoh", s -> System.out.println(new StringBuilder(s).reverse().toString()));
		System.out.println("---------------------------");
		//

		operatorString1("xiaolv", s -> System.out.println(s),
				s -> System.out.println(new StringBuilder(s).reverse().toString()));
	}

	// 定义一个方法 消费字符串
	private static void operatorString(String name, Consumer<String> con) {
		con.accept(name);
	}

	// 定义一个方法 用不同的方式消费一个字符串两次
	private static void operatorString1(String name, Consumer<String> con1, Consumer<String> con2) {
//		con1.accept(name);
//		con2.accept(name);
		con1.andThen(con2).accept(name);
	}
}
