package 树型结构5;

import 线性表3.队列;

public class 二叉查找树<Key extends Comparable<Key>, Value> {
	private Node root;
	private int N;

	private class Node {
		public Key key;
		public Value value;
		public Node left;
		public Node right;

		public Node(Key key, Value value, Node left, Node right) {
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}

	public int size() {
		return N;
	}

	// 增
	void put(Key key, Value value) {
		root = put(root, key, value);
	}

	private Node put(Node x, Key key, Value value) {
		// x子树为空
		if (x == null) {
			N++;
			return new Node(key, value, null, null);
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = put(x.left, key, value);
		} else if (cmp > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = value;
		}
		return x;
	}

	// 查
	Value get(Key key) {
		return get(root, key);
	}

	Value get(Node x, Key key) {
		if (x == null) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			return get(x.left, key);
		} else if (cmp > 0) {
			return get(x.right, key);
		} else {
			return x.value;
		}
	}

	// 删
	void delete(Key key) {
		delete(root, key);
	}

	Node delete(Node x, Key key) {
		if (x == null) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = delete(x.left, key);
		} else if (cmp > 0) {
			x.right = delete(x.right, key);
		} else {
			N--;
			// 找到key 完成真正的删除操作
			if (x.right == null) {
				return x.left;
			}
			if (x.left == null) {
				return x.right;
			}
			Node minNode = x.right;
			while (minNode.left != null) {
				minNode = minNode.left;
			}
			// 删除minNode
			Node n = x.right;
			while (n.left != null) {
				if (n.left.left == null) {
					n.left = null;
				} else {
					n = n.left;
				}
			}
			minNode.left = x.left;
			minNode.right = x.right;
			x = minNode;
		}
		return x;
	}

	// 查找最小键
	public Key min() {
		return min(root).key;
	}

	private Node min(Node x) {
		if (x.left != null) {
			return min(x.left);
		} else {
			return x;
		}
	}

	// 查找最大键
	public Key max() {
		return max(root).key;
	}

	private Node max(Node x) {
		if (x.right != null) {
			return max(x.right);
		} else {
			return x;
		}
	}

	// 前序遍历：根 左子树 右子树
	// 中序遍历：左子树，根，右子树
	// 后序遍历：左子树，右子树，根
	public 队列<Key> preErgodic() {
		队列<Key> keys = new 队列<>();
		preErgodic(root, keys);
		return keys;
	}

	private void preErgodic(Node x, 队列<Key> keys) {
		if (x == null) {
			return;
		}
		keys.enqueue(x.key);
		if (x.left != null) {
			preErgodic(x.left, keys);
		}
		if (x.right != null) {
			preErgodic(x.right, keys);
		}
	}

	public 队列<Key> midErgodic() {
		队列<Key> keys = new 队列<>();
		midErgodic(root, keys);
		return keys;
	}

	private void midErgodic(Node x, 队列<Key> keys) {
		if (x == null) {
			return;
		}
		if (x.left != null) {
			midErgodic(x.left, keys);
		}
		keys.enqueue(x.key);
		if (x.right != null) {
			midErgodic(x.right, keys);
		}
	}

	public 队列<Key> afterErgodic() {
		队列<Key> keys = new 队列<>();
		afterErgodic(root, keys);
		return keys;
	}

	private void afterErgodic(Node x, 队列<Key> keys) {
		if (x == null) {
			return;
		}
		if (x.left != null) {
			afterErgodic(x.left, keys);
		}
		if (x.right != null) {
			afterErgodic(x.right, keys);
		}
		keys.enqueue(x.key);
	}

	// 层序遍历
	public 队列<Key> layerErgodic() {
		队列<Key> keys = new 队列<>();
		队列<Node> nodes = new 队列<>();
		if (root == null) {
			return null;
		}
		nodes.enqueue(root);
		while (!nodes.isEmpty()) {
			Node n = nodes.dequeue();
			keys.enqueue(n.key);

			if (n.left != null) {
				nodes.enqueue(n.left);
			}
			if (n.right != null) {
				nodes.enqueue(n.right);
			}
		}

		return keys;
	}

	// 树的最大深度
	public int maxDepth() {
		return maxDepth(root);
	}

	private int maxDepth(Node x) {
		if (x == null) {
			return 0;
		}
		int max = 0;
		int maxL = 0;
		int maxR = 0;
		if (x.left != null) {
			maxL = maxDepth(x.left);
		}
		if (x.right != null) {
			maxR = maxDepth(x.right);
		}
		max = maxL > maxR ? maxL + 1 : maxR + 1;
		return max;
	}

}
