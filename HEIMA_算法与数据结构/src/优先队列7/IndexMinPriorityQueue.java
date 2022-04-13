package 优先队列7;

public class IndexMinPriorityQueue<T extends Comparable<T>> {
	private T[] items;
	private int[] pq;
	private int[] qp;
	private int N;

	public IndexMinPriorityQueue(int capacity) {
		this.items = (T[]) new Comparable[capacity + 1];
		this.pq = new int[capacity + 1];
		this.qp = new int[capacity + 1];
		this.N = 0;

		for (int i = 0; i < qp.length; i++) {
			qp[i] = -1;
		}
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	private boolean less(int i, int j) {
		return items[pq[i]].compareTo(items[pq[j]]) < 0;
	}

	private void exch(int i, int j) {
		int tmp = pq[i];
		pq[i] = pq[j];
		pq[j] = tmp;

		// 更新qp
		qp[pq[i]] = i;
		qp[pq[j]] = j;
	}

	public boolean contains(int k) {
		return qp[k] != -1;
	}

	public int minIndex() {
		return pq[1];
	}

	public void insert(int i, T t) {
		if (contains(i)) {
			return;
		}
		N++;
		// items i处
		items[i] = t;
		// i存到pq
		pq[N] = i;
		// qp记录pq中的i
		qp[i] = N;
		// 上浮
		swim(N);
	}

	public int delMin() {
		// 获取最小元素的索引
		int minIndex = pq[1];
		// 交换pq中索引1和最大索引的元素
		exch(1, N);
		// 删除qp中对应内容
		qp[pq[N]] = -1;
		// 删除pq最大索引处的内容
		pq[N] = -1;
		// 删除items中对应的内容
		items[minIndex] = null;

		N--;
		sink(1);

		return minIndex;
	}

	public void delete(int i) {
		// i在pq中的索引
		int k = qp[i];
		exch(k, N);
		qp[pq[N]] = -1;
		pq[N] = -1;
		items[i] = null;
		N--;
		sink(k);
		swim(k);
	}

	public void changeItem(int i, T t) {
		items[i] = t;
		int k = qp[i];
		sink(k);
		swim(k);
	}

	private void sink(int k) {
		// TODO Auto-generated method stub
		while (2 * k <= N) {
			int min;
			if (2 * k + 1 <= N) {
				if (less(2 * k, 2 * k + 1)) {
					min = 2 * k;
				} else {
					min = 2 * k + 1;
				}
			} else {
				min = 2 * k;
			}
			if (less(k, min)) {
				break;
			}
			exch(k, min);
			k = min;
		}
	}

	private void swim(int k) {
		// TODO Auto-generated method stub
		while (k > 1) {
			if (less(k, k / 2)) {
				exch(k, k / 2);
			}
			k = k / 2;
		}
	}

}
