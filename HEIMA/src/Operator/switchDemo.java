package Operator;

import java.util.Scanner;

public class switchDemo {
	public static void main(String[] args) {
		Scanner sc_01 = new Scanner(System.in);
		int a = sc_01.nextInt();
		switch (a) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
		default:
			break;
		}
	}
}
