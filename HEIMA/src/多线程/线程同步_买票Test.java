package 多线程;

public class 线程同步_买票Test {
	public static void main(String[] args) {
//		同步代码块解决数据安全问题 st = new 同步代码块解决数据安全问题();
//		Thread t1 = new Thread(st, "窗口1");
//		Thread t2 = new Thread(st, "窗口2");
//		Thread t3 = new Thread(st, "窗口3");
//
//		t1.start();
//		t2.start();
//		t3.start();

		同步方法解决数据安全问题 st = new 同步方法解决数据安全问题();
		Thread t1 = new Thread(st, "window 1");
		Thread t2 = new Thread(st, "window 2");
		Thread t3 = new Thread(st, "window 3");
		t1.start();
		t2.start();
		t3.start();
	}
}
