package 树的进阶8;

public class RedBlackTree {

	private class Node<Key, Value> {
		public Node left;
		public Node right;
		public boolean color;
		private Key key;
		private Value value;

		public Node(Key key, Value value, Node left, Node right, boolean color) {
			this.key = key;
			this.value = value;
			this.right = right;
			this.left = left;
			this.color = color;
		}
	}
}
