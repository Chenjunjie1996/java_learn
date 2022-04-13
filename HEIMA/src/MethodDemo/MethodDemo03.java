package MethodDemo;

// 带返回值
// void 表示无返回值
public class MethodDemo03 {
	public static void main(String[] args) {
		boolean flag = isEvenNumber(20);
		System.out.println(flag);
		int c = getMax(30, 40);
		System.out.println(c);
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
