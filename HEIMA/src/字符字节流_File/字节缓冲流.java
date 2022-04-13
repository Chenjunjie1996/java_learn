package 字符字节流_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 字节缓冲流仅仅提供缓冲区，读写数据还得依靠字节流对象操作
public class 字节缓冲流 {
	public static void main(String[] args) throws IOException {
		// FileOutputStream fos = new FileOutputStream("C:\\Users\\CHEN
		// JUNJIE\\Desktop\\python\\java\\数据结构和算法表缓冲.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\缓冲.txt"));
		bos.write("hello\nworld\n".getBytes());
		bos.close();

		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\缓冲.txt"));
		int by;
		while ((by = bis.read()) != -1) {
			System.out.print((char) by);
		}

		// 一次读取一个字节数组
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}
		bis.close();
	}
}
