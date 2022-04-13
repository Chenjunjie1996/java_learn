package 线性表3;

import java.util.Iterator;

// 先进先出
public class 队列<T> implements Iterable<T> {
	private Node head;
	private int N;
	private Node last;

	private class Node {
		public T item;
		public Node next;

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}

	public 队列() {
		this.head = new Node(null, null);
		this.N = 0;
		this.last = null;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void enqueue(T t) {
		if (last == null) {
			last = new Node(t, null);
			head.next = last;
		} else {
			Node oldLast = last;
			last = new Node(t, null);
			oldLast.next = last;
		}
		N++;
	}

	public T dequeue() {
		if (isEmpty()) {
			return null;
		}
		Node oldFirst = head.next;
		head.next = oldFirst.next;
		N--;
		if (isEmpty()) {
			last = null;
		}
		return oldFirst.item;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new QIterator();
	}

	private class QIterator implements Iterator {
		private Node n;

		public QIterator() {
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
