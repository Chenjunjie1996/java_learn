package 多线程;

public class 同步代码块解决数据安全问题 implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		boolean flag = true;
		while (flag) {

			// 线程安全问题， 同步代码块解决线程安全问题
			// 好处 解决了多线程的数据安全问题
			// 弊端 线程很多时，每个线程都会去判断同步上的锁，耗费资源，降低程序运行效率
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(50);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第" + (100 - tickets + 1) + "张票");
					tickets--;
				} else {
					flag = false;
				}
			}
		}
	}
}
