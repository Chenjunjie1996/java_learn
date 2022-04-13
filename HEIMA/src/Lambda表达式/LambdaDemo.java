package Lambda表达式;

// 使用前提：有一个接口，接口中仅有一个抽象方法
// 匿名内部类：可以是接口 可以是抽象类 可以是具体类
// lambda：只能是接口，且接口中只有一个抽象方法

public class LambdaDemo extends MyRunnable {
	public static void main(String[] args) {
		// 实现类
//		MyRunnable R1 = new MyRunnable();
//		Thread t = new Thread(R1);
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		// 匿名内部类
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("多线程启动");
			}
		}).start();
		// Lambda
		new Thread(() -> {
			System.out.println("多线程启动");
		}).start();
	}

}
