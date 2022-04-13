package 异常;
// throws 处理 延迟处理 让调用者处理

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsHandle {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("continue");
		try {
			method2();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("continue");
	}

	// 运行时异常
	public static void method() throws ArrayIndexOutOfBoundsException {
		int[] arr = { 1, 2, 3 };
		System.out.println(arr[3]);
	}

	// 编译时异常
	public static void method2() throws ParseException {
		String s = "2048-08-09";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
}
