package Operator;

import java.util.Scanner;

public class iFtest01 {
	public static void main(String[] args) {
		Scanner SC_01 = new Scanner(System.in);

		int num1 = SC_01.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("ou");
		} else {
			System.out.println("ji");
		}
	}
}
