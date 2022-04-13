package MethodDemo;

// 带参数的方法

public class MethodDemo02 {
	public static void main(String[] args) {
		isEvennumber(30);
		getMax(30, 40);
	}

	public static void isEvennumber(int number) {
		if (number % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void getMax(int a, int b) {
		if (a > b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
