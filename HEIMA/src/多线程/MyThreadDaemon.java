package 多线程;

public class MyThreadDaemon extends Thread {
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
	public MyThreadDaemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public MyThreadDaemon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
