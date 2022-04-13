package _API;

import java.util.Scanner;

public class CountType {
	public static void main(String[] args) {
		Scanner sc_01 = new Scanner(System.in);
		System.out.println("input a string : ");
		String lineString = sc_01.nextLine();

		int bigcount = 0;
		int smallcount = 0;
		int numbercount = 0;

		for (int i = 0; i < lineString.length(); i++) {
			char ch = lineString.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				bigcount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallcount++;
			} else if (ch >= '0' && ch <= '9') {
				numbercount++;
			}
		}

		System.out.println(bigcount);
		System.out.println(smallcount);
		System.out.println(numbercount);
	}
}
