package MethodDemo;

import java.util.Scanner;

public class TEST02 {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int number = SC.nextInt();
		int[] arr = { 19, 28, 37, 46, 50 };
		int index = getIndex(arr, number);
		System.out.println(index);
	}

	public static int getIndex(int[] arr, int number) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}
}
