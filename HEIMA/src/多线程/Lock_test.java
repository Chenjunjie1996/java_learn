package 多线程;

public class Lock_test {
	public static void main(String[] args) {
		Lock_class lc = new Lock_class();
		Thread t1 = new Thread(lc, "window1");
		Thread t2 = new Thread(lc, "window2");
		Thread t3 = new Thread(lc, "window3");

		t1.start();
		t2.start();
		t3.start();
	}
}
