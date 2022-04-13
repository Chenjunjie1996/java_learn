package 多线程;

// 同步方法的锁对象 this
// 同步静态方法的锁对象 类名.class

public class 同步方法解决数据安全问题 implements Runnable {
	private static int tickets = 100;
	private Object obj = new Object();
	private int x = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = true;
		while (flag) {
			if (x % 2 == 0) {
				synchronized (同步方法解决数据安全问题.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + " is Selling " + (100 - tickets + 1));
						tickets--;
					} else {
						flag = false;
					}
				}
			} else {
				sellTickets();
			}
		}
	}

	private static synchronized void sellTickets() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Selling " + (100 - tickets + 1));
			tickets--;
		}

	}

}
