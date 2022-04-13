package 字符字节流_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流复制图片 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\数据结构和算法表.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\数据结构和算法表.jpg");

		int by;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();

	}
}
