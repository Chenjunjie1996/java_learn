package 优先队列7;

public class IndexMinPriorityQueueTest {
	public static void main(String[] args) {
		IndexMinPriorityQueue<String> queue = new IndexMinPriorityQueue<String>(10);
		// 往队列中添加元素
		queue.insert(0, "A");
		queue.insert(1, "C");
		queue.insert(2, "F");

		// 测试修改
		queue.changeItem(2, "B");

		// 测试删除
		while (!queue.isEmpty()) {
			int index = queue.delMin();
			System.out.print(index + " ");
		}

	}
}
