package 字符字节流_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符缓冲流复制Test {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedR = new BufferedReader(new FileReader("D:\\JAVA\\HEIMA\\src\\字符字节流_File\\File递归.java"));
		BufferedWriter bufferedW = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\copy(buffer).txt"));
		String lineString;
		while ((lineString = bufferedR.readLine()) != null) {
			bufferedW.write(lineString);
			bufferedW.newLine();
			bufferedW.flush();
		}
		bufferedR.close();
		bufferedW.close();
	}
}
