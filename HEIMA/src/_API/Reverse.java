package _API;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc_01 = new Scanner(System.in);
		String s_01 = sc_01.nextLine();
		String s_02 = str_rev(s_01);
		System.out.println(s_02);
	}

	public static String str_rev(String aString) {
		String s_02 = "";
		for (int i = aString.length() - 1; i >= 0; i--) {
			s_02 += aString.charAt(i);
		}
		return s_02;
	}
}
