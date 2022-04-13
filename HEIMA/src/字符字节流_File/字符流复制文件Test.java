package 字符字节流_File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流复制文件Test {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\JAVA\\HEIMA\\src\\字符字节流_File\\File递归.java");
		FileWriter fw = new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\copy.txt");

//		// 1
//		int ch;
//		while ((ch = fr.read()) != -1) {
//			fw.write(ch);
//		}

		// 2
		char[] chs = new char[1024];
		int len;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fr.close();
		fw.close();
	}
}
