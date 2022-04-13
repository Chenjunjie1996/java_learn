package 字符字节流_File;

import java.io.File;

public class File递归 {
	public static void main(String[] args) {
		System.out.println(f(20));

		int Res = f1(5);
		System.out.println("5的阶乘: " + Res);

		// 递归遍历目录
		long start = System.currentTimeMillis();
		File f1 = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python");
		getfile(f1);
		long end = System.currentTimeMillis();
		System.out.println("耗时" + (end - start) + "毫秒");

		// 递归搜索文件
		searchfile(f1);
	}

	public static int f(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}

	public static int f1(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * f1(n - 1);
		}
	}

	public static void getfile(File file) {
		File[] filearr = file.listFiles();
		if (filearr != null) {
			for (File file2 : filearr) {
				if (file2.isDirectory()) { // 规则
					getfile(file2);
				} else {
					System.out.println(file2.getAbsolutePath()); // 出口
				}
			}
		}
	}

	public static void searchfile(File file) {
		File[] filearr = file.listFiles();
		if (filearr != null) {
			for (File file2 : filearr) {
				if (file2.isDirectory()) {
					searchfile(file2);
				} else if (file2.getName().equals("数据结构和算法表.jpg")) {
					System.out.println(file2.getAbsolutePath());
				}
			}
		}
	}
}
