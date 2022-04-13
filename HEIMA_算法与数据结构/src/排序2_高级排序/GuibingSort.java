package 排序2_高级排序;

import java.util.Arrays;

// 时间复杂度 O(nlogn)
// 典型的以空间换时间

public class GuibingSort {
	private static Comparable[] assist;

	public static void sort(Comparable[] a) {
		assist = new Comparable[a.length];
		int lo = 0;
		int hi = a.length - 1;
		sort(a, lo, hi);

	}

	private static void sort(Comparable[] a, int lo, int hi) {
		// 安全校验
		if (lo >= hi) {
			return;
		}
		// lo到hi分为两组
		int mid = lo + (hi - lo) / 2;
		// 归并排序
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		// 归并
		merge(a, lo, mid, hi);
	}

	// 比较
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// 交换
	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		// 定义3个指针 左子组 右子组 辅助数组
		int i = lo;
		int p0 = lo;
		int p1 = mid + 1;
		// 遍历，移动p0和p1指针，比较对应索引处的值，找出最小的放到辅助数组的对应索引处
		while (p0 <= mid && p1 <= hi) {
			if ((less(a[p0], a[p1]))) {
//				assist[i++] = a[p0++] 
				assist[i] = a[p0];
				i++;
				p0++;
			} else {
				assist[i] = a[p1];
				i++;
				p1++;
			}
		}
		// 判断哪一边的序列先走完
		while (p0 <= mid) {
			assist[i] = a[p0];
			i++;
			p0++;
		}
		while (p1 <= hi) {
			assist[i] = a[p1];
			i++;
			p1++;
		}

		for (int index = lo; index <= hi; index++) {
			a[index] = assist[index];
		}
	}

	public static void main(String[] args) {

		Integer[] arr = { 8, 4, 5, 7, 1, 3, 6, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
		int binarySearch = Arrays.binarySearch(arr, 8);
		System.out.println(binarySearch);
	}
}
