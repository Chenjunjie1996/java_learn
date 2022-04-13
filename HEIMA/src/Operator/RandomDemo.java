package Operator;

import java.util.Arrays;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rd_1 = new Random();
		for (int i = 0; i < 10; i++) {
			int number_01 = rd_1.nextInt(10);
			System.out.println(number_01);

		}
		int[] arr = { 1, 2, 3 };
		int[] arr_1 = new int[3];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr_1));
	}
}
