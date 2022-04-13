package 异常;

// Try ... catch ...
// Throws

public class Handle {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("索引不存在");
		}
	}
}
