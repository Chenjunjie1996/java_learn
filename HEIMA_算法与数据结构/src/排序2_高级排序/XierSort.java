package 排序2_高级排序;

import java.util.Arrays;

public class XierSort {
	public static void sort(Comparable[] a) {
		// 增长量h的确定：增长量h的值每一固定的规则,我们这里采用以下规则：
		// 根据数组a的长度，确定增长量h的初始化

		int h = 1;
		while (h < a.length / 2) {
			h = h * 2 + 1;
		}
		while (h >= 1) {
			for (int i = h; i < a.length; i++) {
				for (int j = i; j >= h; j -= h) {
					if (greater(a[j - h], a[j])) {
						exch(a, j - h, j);
					} else {
						break;
					}
				}
			}
			// 减小h的值
			h /= 2;
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
		Integer[] arr = { 9, 1, 2, 5, 7, 4, 8, 6, 3, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
