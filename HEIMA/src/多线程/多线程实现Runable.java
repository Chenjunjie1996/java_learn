package 多线程;

// 多线程实现有两种
// 继承Thread类
// 实现Runnable接口

public class 多线程实现Runable {
	public static void main(String[] args) {
//		MyRunable mr = new MyRunable();
//		Thread t1 = new Thread(mr);
//		Thread t2 = new Thread(mr);
		Thread t1 = new Thread(new MyRunable(), "线程1");
		Thread t2 = new Thread(new MyRunable(), "线程2");
		t1.start();
		t2.start();
	}
}
