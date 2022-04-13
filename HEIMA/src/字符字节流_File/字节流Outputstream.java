package 字符字节流_File;

import java.io.FileOutputStream;
import java.io.IOException;

// inputstream outputstream

public class 字节流Outputstream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\IOtest.txt");
		fos.write(97);
		byte[] arr = { 80, 81, 82 };
		byte[] arr1 = { 80, 81, 82, 85, 86, 87 };
		fos.write(arr);
		fos.write(arr1, 0, 3);

		byte[] title = "\nSequence".getBytes();
		byte[] bys = "abcde".getBytes();
		byte[] nus = "\nATCGGGGGATC".getBytes();

		fos.write(bys);
		fos.write(title);
		fos.write(nus);
		fos.write("\nover".getBytes());
		fos.close();

		// 追加写入
		FileOutputStream fos1 = new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\IOtest.txt", true);
		fos1.write("\nATCGGGTACCCGA".getBytes());
		fos1.close();
	}
}
