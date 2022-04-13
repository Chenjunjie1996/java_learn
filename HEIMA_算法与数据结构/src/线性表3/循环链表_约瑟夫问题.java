package 线性表3;

public class 循环链表_约瑟夫问题 {
	public static void main(String[] args) {
		// 构建循环链表，41个结点
		Node<Integer> first = null;
		Node<Integer> pre = null;
		for (int i = 1; i <= 41; i++) {
			// 第一个结点
			if (i == 1) {
				first = new Node<>(i, null);
				pre = first;
				continue;
			}
			// 中间结点
			Node<Integer> newNode = new Node<>(i, null);
			pre.next = newNode;
			pre = newNode;
			// 最后一个结点
			if (i == 41) {
				pre.next = first;
			}
		}
		// 计数器
		int count = 0;
		// 遍历
		// 记录每次遍历拿到的结点
		Node<Integer> n = first;
		// 记录当前结点的上一个结点
		Node<Integer> before = null;
		while (n != n.next) {
			// 报数
			count++;
			// 如果是3，则把当前结点删除调用，打印当前结点，重置count=0，让当前结点n后移
			if (count == 3) {
				before.next = n.next;
				System.out.print(n.item + ";");
				count = 0;
				n = n.next;
			} else {
				before = n;
				n = n.next;
			}
		}
		System.out.println(n.item);

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
