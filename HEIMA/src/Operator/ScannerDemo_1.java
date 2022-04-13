package Operator;

import java.util.Scanner;

public class ScannerDemo_1 {
	public static void main(String[] args) {
		Scanner SC_1 = new Scanner(System.in);

		int height1 = SC_1.nextInt();
		int height2 = SC_1.nextInt();
		int height3 = SC_1.nextInt();

		int tempheight = height1 > height2 ? height1 : height2;
		int maxheight = tempheight > height3 ? tempheight : height3;

		System.out.println(maxheight);
	}
}
