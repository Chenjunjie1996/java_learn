package _API;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String[] args) {
		Scanner sc_01 = new Scanner(System.in);
		String s1 = sc_01.nextLine();
		String oUTString = reverse(s1);
		System.out.println(oUTString);

		String s2 = sc_01.nextLine();
		String ouString = myReverse(s2);
		System.out.println(ouString);

		String s3 = sc_01.nextLine();
		String outString2 = myreverse(s3);
		System.out.println(outString2);

	}

	public static String reverse(String S) {
		StringBuilder SB = new StringBuilder();
		for (int i = S.length() - 1; i >= 0; i--) {
			SB.append(S.charAt(i));
		}
		String S_OUT = SB.toString();
		return S_OUT;
	}

	// STRINGBUILDER REVERSE()
	public static String myReverse(String S) {
		StringBuilder SB_1 = new StringBuilder(S);
		SB_1.reverse();
		String S_OUT = SB_1.toString();
		return S_OUT;
	}

	// STRINGBUILDER REVERSE() SIMPLE
	public static String myreverse(String S) {
		String s_OUTString = new StringBuilder(S).reverse().toString();
		return s_OUTString;
	}
}
