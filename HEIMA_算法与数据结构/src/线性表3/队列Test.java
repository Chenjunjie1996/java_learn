package 线性表3;

public class 队列Test {
	public static void main(String[] args) {
		队列<String> QU = new 队列<String>();
		QU.enqueue("a");
		QU.enqueue("b");
		QU.enqueue("c");
		QU.enqueue("d");
		for (String string : QU) {
			System.out.println(string);
		}

		System.out.println("====================");
		String dequestring = QU.dequeue();
		System.out.println(dequestring);
		System.out.println(QU.size());

	}
}
