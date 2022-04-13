package 多线程;

public class 线程控制 {
	public static void main(String[] args) {
//		MyThreadSleep my1 = new MyThreadSleep("线程1");
//		MyThreadSleep my2 = new MyThreadSleep("线程2");
//		MyThreadSleep my3 = new MyThreadSleep("线程3");
//		my1.start();
//		my2.start();
//		my3.start();

//		MythreadJoin my1 = new MythreadJoin("线程1");
//		MythreadJoin my2 = new MythreadJoin("线程2");
//		MythreadJoin my3 = new MythreadJoin("线程3");
//		my1.start();
//		try {
//			my1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		my2.start();
//		my3.start();

		MyThreadDaemon my1 = new MyThreadDaemon("线程1");
		MyThreadDaemon my2 = new MyThreadDaemon("线程2");
		Thread.currentThread().setName("主线程");
		// 设置守护线程
		my1.setDaemon(true);
		my2.setDaemon(true);
		my1.start();
		my2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
