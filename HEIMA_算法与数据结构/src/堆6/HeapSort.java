package 堆6;

public class HeapSort {
	private static boolean less(Comparable[] heap, int i, int j) {
		return heap[i].compareTo(heap[j]) < 0;
	}

	private static void exch(Comparable[] heap, int i, int j) {
		Comparable tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	// 根据原数组，构造堆
	private static void createHeap(Comparable[] source, Comparable[] heap) {
		System.arraycopy(source, 0, heap, 1, source.length);

		// 对堆中元素下沉调整
		for (int i = (heap.length) / 2; i > 0; i--) {
			sink(heap, i, heap.length - 1);
		}
	}

	// 对target处的元素下沉 范围0~range
	private static void sink(Comparable[] heap, int target, int range) {
		while (2 * target <= range) {
			int max;
			if (2 * target + 1 <= range) {
				if (less(heap, 2 * target, 2 * target + 1)) {
					max = 2 * target + 1;
				} else {
					max = 2 * target;
				}
			} else {
				max = 2 * target;
			}
			if (!less(heap, target, max)) {
				break;
			}
			exch(heap, target, max);
			target = max;
		}
	}

	// 对source数组由小到大堆排序
	public static void sort(Comparable[] source) {
		Comparable[] heap = new Comparable[source.length + 1];
		createHeap(source, heap);
		int N = heap.length - 1;
		while (N != 1) {
			exch(heap, 1, N);
			N--;
			sink(heap, 1, N);
		}
		System.arraycopy(heap, 1, source, 0, source.length);
	}
}
