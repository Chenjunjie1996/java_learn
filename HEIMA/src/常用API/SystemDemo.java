package 常用API;

public class SystemDemo {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

		// 计时
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时" + (end - start) + "毫秒");

		System.exit(0);
	}
}
