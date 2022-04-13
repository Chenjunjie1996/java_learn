package 函数式接口;

public class RunnableDemo {
	public static void main(String[] args) {
		// 匿名内部类
		StartThread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "线程启动");
			}
		});

		StartThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动"));
	}

	private static void StartThread(Runnable r) {
		new Thread(r).start();
	}
}
