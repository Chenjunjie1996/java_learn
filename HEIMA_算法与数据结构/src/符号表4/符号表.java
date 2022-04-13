package 符号表4;

// 将键值联系起来
public class 符号表<Key, Value> {
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

	public 符号表() {
		this.head = new Node(null, null, null);
		this.N = 0;
	}

	int size() {
		return N;
	}

	void put(Key key, Value value) {
		// 存在 替换
		Node n = head;
		while (n.next != null) {
			n = n.next;
			if (n.key.equals(key)) {
				n.value = value;
				return;
			}
		}
		// head.next 指向新结点
		Node newNode = new Node(key, value, null);
		Node oldFirst = head.next;
		newNode.next = oldFirst;
		head.next = newNode;

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
