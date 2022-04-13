package 多线程;

// join() 等待这个线程死亡 优先执行完毕
public class MythreadJoin extends Thread {

	/**
	 * 
	 */
	public MythreadJoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public MythreadJoin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}
