package 异常;

// getMessage  toString() printStackTrace()

public class Throwable成员方法 {
	public static void main(String[] args) {
		method();
		System.out.println("continue");
	}

	public static void method() {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[3]); // new ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			String s = e.toString();
			System.out.println(s);
		}
	}
}
