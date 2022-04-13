package 排序2_高级排序;

// 快速排序和归并排序都是分治思想
// 快速排序时间复杂度O(nlogn)

import java.util.Arrays;

public class QuickSort {
	public static void sort(Comparable[] a) {
		int lo = 0;
		int hi = a.length - 1;
		sort(a, lo, hi);
	}

	// 对数组a中从索引lo到索引hi之间的元素进行排序
	private static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		// 分为两组 左子组，右子组
		int partition = partition(a, lo, hi); // 返回分界值的索引
		// 让左子组有序
		sort(a, lo, partition - 1);
		// 让右子组有序
		sort(a, partition + 1, hi);
	}

	public static int partition(Comparable[] a, int lo, int hi) {
		// 确定分界值
		Comparable key = a[lo];
		// 左 右 指针
		int left = lo;
		int right = hi + 1;
		// 切分
		while (true) {
			// 先从右往左扫描，找到一个比分界值小的值停止
			while (less(key, a[--right])) {
				if (right == lo) {
					break;
				}
			}
			// 再从左往右扫面，找到一个比分界值大的值停止
			while (less(a[++left], key)) {
				if (left == hi) {
					break;
				}
			}
			// 若left>=right 结束循环
			if (left >= right) {
				break;
			} else {
				// 反之 交换
				exch(a, left, right);
			}
		}
		// 交换分界值
		exch(a, lo, right);
		return right;
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * 交换元素
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		Integer[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 8 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
