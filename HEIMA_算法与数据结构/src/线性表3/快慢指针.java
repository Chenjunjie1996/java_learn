package 线性表3;

public class 快慢指针 {
	public static void main(String[] args) {
		// 创建结点
		Node<String> first = new Node<String>("aa", null);
		Node<String> second = new Node<String>("bb", null);
		Node<String> third = new Node<String>("cc", null);
		Node<String> fourth = new Node<String>("dd", null);
		Node<String> fifth = new Node<String>("ee", null);
		Node<String> six = new Node<String>("ff", null);
		Node<String> seven = new Node<String>("gg", null);

		// 完成结点之间的指向
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next = seven;

		String mid = getMid(first);
		System.out.println(mid);
	}

	public static String getMid(Node<String> first) {
		Node<String> fast = first;
		Node<String> slow = first;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.item;

	}

	private static class Node<T> {
		T item;
		Node next;

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}
}
