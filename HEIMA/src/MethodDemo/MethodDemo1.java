package MethodDemo;

public class MethodDemo1 {
	public static void main(String[] args) {
		isEvennumber();
		getMax();
	}

	public static void isEvennumber() {
		int num1 = 10;
		if (num1 % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void getMax() {
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
