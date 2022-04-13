package 字符字节流_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 字符流读写数据 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流");
		System.out.println(f1.mkdir());
		File f2 = new File(f1, "test.txt");
		System.out.println(f2.createNewFile());
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f2, true));
		// 写入字符
		osw.write("\nnb\n");
		osw.flush(); // 缓冲

		// 写入字符数组
		char[] chs = { 'a', 'b', 'c', 'd', 'e' };
		osw.write(chs, 0, chs.length);
		osw.flush();

		// 写入字符串
		osw.write("\nabcde");
		osw.flush();

		osw.close();

		// 读数据
		InputStreamReader isr = new InputStreamReader(new FileInputStream(f2));
		int ch;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}
		isr.close();

		InputStreamReader isr1 = new InputStreamReader(new FileInputStream(f2));
		char[] chs1 = new char[1024];
		int len;
		while ((len = isr1.read(chs1)) != -1) {
			System.out.print(new String(chs1, 0, len));
		}
		isr1.close();

	}
}
