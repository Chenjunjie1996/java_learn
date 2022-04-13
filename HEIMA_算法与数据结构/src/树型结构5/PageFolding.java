package 树型结构5;

import 线性表3.队列;

public class PageFolding {
	public static void main(String[] args) {

		// 模拟这过程，产生树
		Node<String> tree = createTree(2);
		// 遍历树，打印每个结点
		printTree(tree);
	}

	public static Node<String> createTree(int N) {
		Node<String> root = null;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				root = new Node<>("down", null, null);
				continue;
			}
			队列<Node> queue = new 队列<>();
			queue.enqueue(root);
			while (!queue.isEmpty()) {
				Node<String> tmp = queue.dequeue();
				if (tmp.left != null) {
					queue.enqueue(tmp.left);
				}
				if (tmp.right != null) {
					queue.enqueue(tmp.right);
				}
				if (tmp.left == null && tmp.right == null) {
					tmp.left = new Node<String>("down", null, null);
					tmp.right = new Node<String>("up", null, null);
				}
			}
		}
		return root;
	}

	public static void printTree(Node<String> root) {
		// 需要使用中序遍历完成
		if (root == null) {
			return;
		}

		// 打印左子树的每个结点
		if (root.left != null) {
			printTree(root.left);
		}
		// 打印当前结点
		System.out.print(root.item + " ");
		// 打印右子树的每个结点
		if (root.right != null) {
			printTree(root.right);
		}

	}

	private static class Node<T> {
		public T item;
		public Node left;
		public Node right;

		public Node(T item, Node left, Node right) {
			this.item = item;
			this.left = left;
			this.right = right;
		}

	}
}
