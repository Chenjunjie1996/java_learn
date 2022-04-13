package MethodDemo;

import java.util.Arrays;
import java.util.Scanner;

public class TEST03 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr_rev = revArr(arr);
		System.out.println(Arrays.toString(arr_rev));

		int[] arr_1 = new int[6];
		Scanner SC_01 = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			arr_1[i] = SC_01.nextInt();
		}
		System.out.println(Arrays.toString(arr_1));
		int max_score = getMax(arr_1);
		System.out.println(max_score);
	}

	// 反转数组
	public static int[] revArr(int[] arr) {
		int[] arr_rev = new int[arr.length];
		for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
			arr_rev[start] = arr[end];
			arr_rev[end] = arr[start];
		}
		return arr_rev;
	}

	// 评委打分
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
