package 多线程;

public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}

	/**
	 * 
	 */
	public MyThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param target
	 */
	public MyThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public MyThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
