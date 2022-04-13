package 常用API;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前： " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("排序后： " + Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int j = 0; j < arr.length - 1 - x; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return;
	}
}
