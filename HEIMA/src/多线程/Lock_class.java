package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// try finally 块 实现 lock unlock

public class Lock_class implements Runnable {
	private int tickets = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = true;
		while (flag) {
			try {
				lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " is selling" + (100 - tickets + 1));
					tickets--;
				} else {
					flag = false;
				}
			} finally {
				// TODO: handle exception
				lock.unlock();
			}

		}
	}

}
