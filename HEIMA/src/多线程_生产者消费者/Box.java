package 多线程_生产者消费者;

public class Box {
	private int milk;
	private boolean state = false;

	public synchronized void put(int milk) {
		// 如果有牛奶，等待消费
		if (state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 如果没有，生产牛奶
		this.milk = milk;
		System.out.println("送奶工" + this.milk + "瓶奶放入奶箱");
		// 修改状态
		state = true;
		// 唤醒其他等待的线程
		notifyAll();
	}

	public synchronized void get() {

		// 如果没有牛奶 等待生产
		if (!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 如果有牛奶 消费牛奶
		System.out.println("用户拿到第" + this.milk + "瓶奶");

		// 修改状态
		state = false;
		// 唤醒
		notifyAll();
	}
}
