package Operator;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner SC_1 = new Scanner(System.in);

		// 接收数据
		int x = SC_1.nextInt();

		// 输出
		System.out.println("x : " + x);
	}
}
