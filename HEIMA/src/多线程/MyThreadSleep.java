package 多线程;

public class MyThreadSleep extends Thread {

	/**
	 * 
	 */
	public MyThreadSleep() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public MyThreadSleep(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
