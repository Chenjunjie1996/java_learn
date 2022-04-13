package 线性表3;

import java.util.Iterator;

public class Liner_SequenceList<T> implements Iterable<T> {
	// 存储元素的数组
	private T[] eles;
	// 元素个数
	private int N;

	public Liner_SequenceList(int capacity) {
		// 初始化数组
		this.eles = (T[]) new Object[capacity];
		this.N = 0;
	}

	public void clear() {
		this.N = 0;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int length() {
		return N;
	}

	public T get(int i) {
		return eles[i];
	}

	public void insert(T t) {
		if (N == eles.length) {
			resize(2 * eles.length);
		}

		eles[N++] = t;
	}

	public void insert(int i, T t) {
		// 将i索引以及后继元素依次向后移动一位
		for (int index = N; index > i; index--) {
			eles[index] = eles[index - 1];
		}
		eles[i] = t;
		N++;
	}

	public T remove(int i) {
		// 记录i处的值
		T current = eles[i];
		// 依次向前移动一位
		for (int index = i; index < N - 1; index++) {
			eles[index] = eles[index + 1];
		}
		N--;

		if (N < eles.length / 4) {
			resize(eles.length / 2);
		}

		return current;
	}

	public int indexOf(T t) {
		for (int i = 0; i < N; i++) {
			if (eles[i].equals(t)) {
				return i;
			}
		}
		return -1;
	}

	// 根据参数newSize，重置eles的大小
	public void resize(int newSize) {
		// 定义临时数组，指向原数组
		T[] temp = eles;
		// 创建新数组
		eles = (T[]) new Object[newSize];
		// 把原数组的数据拷贝到新数组
		for (int i = 0; i < N; i++) {
			eles[i] = temp[i];
		}
	}

	// 遍历
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new SIterator();
	}

	private class SIterator implements Iterator {
		private int cusor;

		public SIterator() {
			this.cusor = 0;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cusor < N;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return eles[cusor++];
		}

	}
}
