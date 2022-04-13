package 树型结构5;

public class ErgodicTest {
	public static void main(String[] args) {
		二叉查找树<String, String> tree = new 二叉查找树<>();
		tree.put("E", "5");
		tree.put("B", "2");
		tree.put("G", "7");
		tree.put("A", "1");
		tree.put("D", "4");
		tree.put("F", "6");
		tree.put("H", "8");
		tree.put("C", "3");
//		队列<String> keys = tree.preErgodic();
//		for (String key : keys) {
//			String value = tree.get(key);
//			System.out.println(key + "----" + value);

//		队列<String> keys = tree.midErgodic();
//		for (String key : keys) {
//			String value = tree.get(key);
//			System.out.println(key + "----" + value);
//		}

//		队列<String> keys = tree.afterErgodic();
//		for (String key : keys) {
//			String value = tree.get(key);
//			System.out.println(key + "----" + value);
//		}

//		队列<String> keys = tree.layerErgodic();
//		for (String key : keys) {
//			String value = tree.get(key);
//			System.out.println(key + "----" + value);
//		}

		int maxDepth = tree.maxDepth();
		System.out.println(maxDepth);
	}
}
