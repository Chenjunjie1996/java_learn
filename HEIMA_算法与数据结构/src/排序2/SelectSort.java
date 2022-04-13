package 排序2;

import java.util.Arrays;

// 选择排序 O(n^2)

public class SelectSort {
	public static void sort(Comparable[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (greater(a[minIndex], a[j])) {
					minIndex = j;
				}
			}
			exch(a, i, minIndex);
		}
	}

	private static boolean greater(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		Integer[] arr = { 4, 5, 6, 3, 2, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
