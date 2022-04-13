package 字符字节流_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制 {
	public static void main(String[] args) throws IOException {
		FileInputStream FIS = new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\IOtest.txt");
		FileOutputStream FOS = new FileOutputStream(
				"C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\mkdirs\\IOtest.txt");

		int by;
		while ((by = FIS.read()) != -1) {
			FOS.write(by);
		}
		FOS.close();
		FIS.close();
	}
}
