package 字符字节流_File;

// 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流复制视频 {
	public static void main(String[] args) throws IOException {
		long startime = System.currentTimeMillis();
		// method1(); 很长
		// method2(); 1745ms
		// method3(); 2904ms
		// method4(); 418ms
		long endtime = System.currentTimeMillis();
		System.out.println("耗时: " + (endtime - startime) + "ms");
	}

	public static void method1() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\CHEN JUNJIE\\Videos\\Captures\\Dota 2 2019-07-06 23-25-30.mp4");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\dota2.mp4");
		int by;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

	public static void method2() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\CHEN JUNJIE\\Videos\\Captures\\Dota 2 2019-07-06 23-25-30.mp4");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\dota2.mp4");
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		fis.close();
		fos.close();
	}

	public static void method3() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("C:\\Users\\CHEN JUNJIE\\Videos\\Captures\\Dota 2 2019-07-06 23-25-30.mp4"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\dota2.mp4"));
		int by;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}
		bis.close();
		bos.close();
	}

	public static void method4() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("C:\\Users\\CHEN JUNJIE\\Videos\\Captures\\Dota 2 2019-07-06 23-25-30.mp4"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\dota2.mp4"));

		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bis.close();
		bos.close();
	}

}
