package 线性表3;

import java.util.Iterator;

// 供数据休息的地方，先进后出的在一端操作的特殊线性表

public class 栈<T> implements Iterable<T> {
	private Node head;
	private int N;

	private class Node {
		public T item;
		public Node next;

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}

	public 栈() {
		this.head = new Node(null, null);
		this.N = 0;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void push(T t) {
		Node oldFirst = head.next;
		Node newNode = new Node(t, null);
		head.next = newNode;
		newNode.next = oldFirst;
		N++;
	}

	public T pop() {
		Node oldFirst = head.next;
		if (oldFirst == null) {
			return null;
		}
		head.next = oldFirst.next;
		N--;
		return oldFirst.item;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new SIterator();
	}

	private class SIterator implements Iterator {
		private Node n;

		public SIterator() {
			this.n = head;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return n.next != null;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			n = n.next;
			return n.item;
		}

	}
}
