package 字符字节流_集合到文件;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class 特殊操作流_标准输出流 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = System.out;
		ps.print(false);
		ps.println();

		// 字节打印流
		PrintStream pm = new PrintStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\打印流.txt");
		pm.write(97);
		// 特有方法
		pm.println(false);
		pm.print(97);
		pm.close();

		// 字符打印流
		PrintWriter pw = new PrintWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\打印流1.txt");
		pw.write("hello");
		pw.println("world");
		pw.flush();
		pw.close();

		PrintWriter pw1 = new PrintWriter(new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\打印流1.txt"),
				true);
		pw1.println("hello");
		pw1.println("world");
		pw1.close();
	}
}
