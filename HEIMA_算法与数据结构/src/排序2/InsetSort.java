package 排序2;

// 插入排序 O(n^2)
// 元素分为两组， 一组未排序，一组已排序
// 找到未排序的第一个元素，向已排序组中插入

import java.util.Arrays;

public class InsetSort {
	public static void sort(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (greater(a[j - 1], a[j])) {
					exch(a, j - 1, j);
				} else {
					break;
				}
			}
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
		Integer[] arr = { 4, 3, 2, 10, 12, 1, 5, 6 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
