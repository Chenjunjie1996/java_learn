package 线性表3;

public class 单向链表环入口 {
	public static void main(String[] args) {
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
		// 产生环
		seven.next = third;

		Node<String> enter = getEnter(first);
		System.out.println(enter.item);
	}

	private static Node getEnter(Node<String> first) {
		// TODO Auto-generated method stub
		Node<String> fast = first;
		Node<String> slow = first;
		Node<String> temp = null;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				temp = first;
				continue;
			}
			if (temp != null) {
				temp = temp.next;
				if (temp == slow) {
					break;
				}
			}
		}
		return temp;
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
