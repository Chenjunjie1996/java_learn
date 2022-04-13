package 堆6;

import java.util.Arrays;

public class HeapSortTest {
	public static void main(String[] args) {
		String[] arr = { "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E" };
		HeapSort.sort(arr);
		System.out.println(Arrays.toString(arr));

		Integer[] arr1 = { 1, 3, 6, 4, 2, 5, 6, 0, 9, 8, 8, 7 };
		HeapSort.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
