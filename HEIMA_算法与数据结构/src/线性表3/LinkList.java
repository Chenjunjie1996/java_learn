package 线性表3;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
	private Node head;
	private int N;

	private class Node {
		// 存储数据
		T item;

		// 下一个节点
		Node next;

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}

	public LinkList() {
		// 初始化头节点
		this.head = new Node(null, null);
		// 初始化元素个数
		this.N = 0;
	}

	public int length() {
		return N;
	}

	// 清空
	public void clear() {
		head.next = null;
		this.N = 0;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	// 获取指定位置i的元素，通过循环
	public T get(int i) {
		Node n = head.next;
		for (int index = 0; index < i; index++) {
			n = n.next;
		}
		return n.item;
	}

	// 插入元素
	public void insert(T t) {
		// 找到最后一个结点
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		// 创建新结点，保存元素t
		Node newNode = new Node(t, null);
		// 当前最后一个结点指向新节点
		n.next = newNode;
		// 元素个数+1
		N++;
	}

	public void insert(int i, T t) {
		// i 前一个结点
		Node pre = head;
		for (int index = 0; index < i - 1; index++) {
			pre = pre.next;
		}
		// i 结点
		Node curr = pre.next;
		// 创建新节点 指向原来i位置的结点
		Node newNode = new Node(t, curr);
		// 原来i位置的前一个结点指向新节点
		pre.next = newNode;

		N++;
	}

	public T remove(int i) {
		// i 前一个结点
		Node pre = head;
		for (int index = 0; index < i - 1; i++) {
			pre = pre.next;
		}
		// i 结点
		Node curr = pre.next;
		// i 下一个结点
		Node nextNode = curr.next;
		// i前一个指向i下一个结点
		pre.next = nextNode;
		N--;
		return curr.item;
	}

	// 查找
	public int indexOf(T t) {
		// 遍历链表
		Node n = head;
		for (int i = 0; n.next != null; i++) {
			n = n.next;
			if (n.item.equals(t)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LIterator();
	}

	private class LIterator implements Iterator {
		private Node n;

		public LIterator() {
			this.n = head;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return n.next != null;
		}

		@Override
		public Object next() {
			n = n.next;
			return n.item;
		}

	}

	// 反转整个链表
	public void reverse() {
		if (isEmpty()) {
			return;
		}
		reverse(head.next);

	}

	public Node reverse(Node curr) {
		// 出口：
		if (curr.next == null) {
			head.next = curr;
			return curr;
		}
		Node pre = reverse(curr.next);
		pre.next = curr;
		curr.next = null;
		return curr;

	}

}
