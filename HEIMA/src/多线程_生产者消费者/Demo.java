package 多线程_生产者消费者;

public class Demo {
	public static void main(String[] args) {
		Box b = new Box();
		Producer p = new Producer(b);
		Customer c = new Customer(b);

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
