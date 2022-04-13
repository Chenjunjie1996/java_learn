package 多线程;

// 分时
// 抢占 (java)
// getPriority setPriority
public class 线程调度 {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("线程1");
		MyThread my2 = new MyThread("线程2");
		MyThread my3 = new MyThread("线程3");
		System.out.println(my1.getPriority() + " " + my2.getPriority() + " " + my3.getPriority());
		System.out.println(my1.MIN_PRIORITY + "----" + my1.NORM_PRIORITY + "----" + my1.MAX_PRIORITY);
		my1.setPriority(10);
		my2.setPriority(1);
		my3.setPriority(1);
		my1.start();
		my2.start();
		my3.start();
	}
}
