package 函数式接口;

import java.util.function.Consumer;

public class ConsumerDemo1 {
	public static void main(String[] args) {
		String[] strArray = { "xiaoh,30", "xiaolv,25", "xiaohuang,20" };
		printinfo(strArray, str -> System.out.print("姓名：" + str.split(",")[0]),
				str -> System.out.println("，年龄：" + Integer.parseInt(str.split(",")[1])));
	}

	private static void printinfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
		for (String str : strArray) {
			con1.andThen(con2).accept(str);
		}
	}
}
