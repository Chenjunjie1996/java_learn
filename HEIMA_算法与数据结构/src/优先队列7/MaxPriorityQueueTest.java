package 优先队列7;

public class MaxPriorityQueueTest {
	public static void main(String[] args) {
		MaxPriorityQueue<String> queue = new MaxPriorityQueue<>(10);
		// 往队列中存储元素
		queue.insert("A");
		queue.insert("B");
		queue.insert("C");
		queue.insert("D");
		queue.insert("E");
		queue.insert("F");
		queue.insert("G");

		while (!queue.isEmpty()) {
			String max = queue.delMax();
			System.out.print(max + " ");
		}

		System.out.println("\n=============");
		MinPriorityQueue<String> mqueue = new MinPriorityQueue<>(10);
		// 往队列中存储元素
		mqueue.insert("A");
		mqueue.insert("B");
		mqueue.insert("C");
		mqueue.insert("D");
		mqueue.insert("E");
		mqueue.insert("F");
		mqueue.insert("G");
		while (!mqueue.isEmpty()) {
			String min = mqueue.delMin();
			System.out.print(min + " ");
		}
	}
}
