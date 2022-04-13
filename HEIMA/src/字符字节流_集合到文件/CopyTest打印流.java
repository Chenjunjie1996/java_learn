package 字符字节流_集合到文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyTest打印流 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("D:\\JAVA\\HEIMA\\src\\关系案例_教练运动员\\Person.java"));
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\打印流test.txt"));
		String line;
		while ((line = bfr.readLine()) != null) {
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
		bfr.close();

		BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\HEIMA\\src\\关系案例_教练运动员\\Person.java"));
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\打印流test1.txt"),
				true);
		String lineString;
		while ((lineString = br.readLine()) != null) {
			pw.println(lineString);
		}
		br.close();
		pw.close();
	}
}
