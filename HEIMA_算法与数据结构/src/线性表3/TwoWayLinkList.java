package 线性表3;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T> {
	private Node head;
	private Node last;
	private int N;

	private class Node {
		public Node(T item, Node pre, Node next) {
			this.item = item;
			this.pre = pre;
			this.next = next;
		}

		public T item;
		public Node pre;
		public Node next;
	}

	public TwoWayLinkList() {
		// 初始化
		this.head = new Node(null, null, null);
		this.last = null;
		this.N = 0;
	}

	public void clear() {
		this.head.next = null;
		this.head.pre = null;
		this.head.item = null;
		this.last = null;
		this.N = 0;
	}

	public int length() {
		return N;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public T getfirst() {
		if (isEmpty()) {
			return null;
		}
		return head.next.item;
	}

	public T getlast() {
		if (isEmpty()) {
			return null;
		}
		return last.item;
	}

	public void insert(T t) {
		// 链表为空
		if (isEmpty()) {
			Node newNode = new Node(t, head, null);
			last = newNode;
			head.next = last;
		} else {
			// 链表不为空
			Node oldLast = last;
			Node newNode = new Node(t, oldLast, null);
			oldLast.next = newNode;
			last = newNode;
		}
		N++;
	}

	public void insert(int i, T t) {
		// i位置前一个结点
		Node pre = head;
		for (int index = 0; index < i; index++) {
			pre = pre.next;
		}
		// i位置结点
		Node curr = pre.next;
		// i位置下一个结点
		Node newNode = new Node(t, pre, curr);

		pre.next = newNode;
		curr.pre = newNode;
		N++;
	}

	public T get(int i) {
		Node n = head.next;
		for (int index = 0; index < i; index++) {
			n = n.next;
		}
		return n.item;
	}

	public int indexOf(T t) {
		Node n = head;
		for (int i = 0; n.next != null; i++) {
			n = n.next;
			if (n.next.equals(t)) {
				return i;
			}
		}
		return -1;
	}

	public T remove(int i) {
		// i 前一个结点
		Node pre = head;
		for (int index = 0; index < i; index++) {
			pre = pre.next;
		}
		// i位置结点
		Node curr = pre.next;
		// i位置下一个结点
		Node nextNode = curr.next;

		pre.next = nextNode;
		nextNode.pre = pre;
		N--;
		return curr.item;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new TIterator();
	}

	private class TIterator implements Iterator {
		private Node n;

		public TIterator() {
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
			return null;
		}

	}

}
