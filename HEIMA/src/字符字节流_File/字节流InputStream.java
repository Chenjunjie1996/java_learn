package 字符字节流_File;

import java.io.FileInputStream;
import java.io.IOException;

// 读数据

public class 字节流InputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\IOtest1.txt");

		// 一次读一个
		int read = fis.read();
		System.out.println(read);
		System.out.println((char) read);
		fis.close();

		System.out.println("============");

		// 全读
		FileInputStream fis1 = new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\IOtest1.txt");
		int by;
		while ((by = fis1.read()) != -1) {
			System.out.print((char) by);
		}
		fis1.close();

		// 读数组
		FileInputStream fis2 = new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\mkdirs\\IOtest.txt");
		byte[] bys = new byte[1024];
		int len;

		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}
		fis2.close();
	}
}
