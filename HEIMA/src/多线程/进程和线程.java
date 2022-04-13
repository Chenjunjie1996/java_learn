package 多线程;

// 进程 是正在运行的程序
// 线程 是进程中的单个顺序控制流，一条执行路径

// 多线程 Thread类
public class 进程和线程 {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
//		my1.run(); // 普通调用
//		my2.run(); //
		my1.setName("线程1");
		my1.start(); // 启动线程 由JVM调用run()方法
		my2.setName("线程2");
		my2.start();
//		my1.stop();
//		my2.stop();

		System.out.println(Thread.currentThread().getName());
	}
}
