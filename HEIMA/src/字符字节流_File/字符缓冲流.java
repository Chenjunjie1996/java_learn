package 字符字节流_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Buffered 特有 bfw.newLine  bfw.readLine
public class 字符缓冲流 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("D:\\JAVA\\HEIMA\\src\\字符字节流_File\\File递归.java"));
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\copy.txt"));
		/*
		 * 1 int ch; while ((ch = bfr.read()) != -1) { bfw.write(ch); }
		 * 
		 * 2 char[] chs = new char[1024]; int len; while ((len = bfr.read(chs)) != -1) {
		 * bfw.write(chs, 0, len); }
		 * 
		 * bfr.close(); bfw.close();
		 */
		String lineString;
		while ((lineString = bfr.readLine()) != null) {
			System.out.println(lineString);
		}
		bfr.close();
		bfw.close();
	}
}
