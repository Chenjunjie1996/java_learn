package MethodDemo;
// 方法重载

public class MethodDemo04 {
	public static void main(String[] args) {
		int res = sum(1, 20);
		double res1 = sum(10.0, 2.0);
		int res2 = sum(3, 4, 5);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
