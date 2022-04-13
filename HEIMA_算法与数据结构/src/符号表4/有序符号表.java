package 符号表4;

// 将键值联系起来
public class 有序符号表<Key extends Comparable<Key>, Value> {
	private Node head;
	private int N;

	private class Node {
		public Key key;
		public Value value;
		public Node next;

		public Node(Key key, Value value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

	}

	public 有序符号表() {
		this.head = new Node(null, null, null);
		this.N = 0;
	}

	int size() {
		return N;
	}

	void put(Key key, Value value) {
		Node curr = head.next;
		Node pre = head;
		while (curr != null && key.compareTo(curr.key) > 0) {
			pre = curr;
			curr = curr.next;
		}
		// 若相等 替换
		if (curr != null && key.compareTo(key) == 0) {
			curr.value = value;
			return;
		}
		Node newNode = new Node(key, value, curr);
		pre.next = newNode;
		N++;
	}

	void delete(Key key) {
		Node n = head;
		// 若存在key
		while (n.next != null) {
			if (n.next.key.equals(key)) {
				n.next = n.next.next;
				N--;
				return;
			}
			n = n.next;
		}
	}

	Value get(Key key) {
		Node n = head;
		while (n.next != null) {
			n = n.next;
			if (n.next.key.equals(key)) {
				return n.value;
			}
		}
		return null;
	}

}
