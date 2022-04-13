package 树型结构5;

public class 二叉查找树test {
	public static void main(String[] args) {
		二叉查找树<Integer, String> tree = new 二叉查找树<>();

		tree.put(1, "zhangsan");
		tree.put(2, "lisi");
		tree.put(3, "wangwu");
		System.out.println(tree.size());

		System.out.println(tree.get(2));

		tree.delete(2);
		System.out.println(tree.size());

		Integer max = tree.max();
		System.out.println(max);
		Integer min = tree.min();
		System.out.println(min);
	}
}
