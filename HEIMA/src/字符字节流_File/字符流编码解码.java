package 字符字节流_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// reader writer
// InpuStreamReader OutputStreamWriter
public class 字符流编码解码 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流");
		System.out.println(f1.mkdir());
		File f2 = new File(f1, "test.txt");
		System.out.println(f2.createNewFile());
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f2));
		osw.write("Chinese\n" + "123");
		osw.close();

		InputStreamReader isr = new InputStreamReader(new FileInputStream(f2));
		int ch;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}
		isr.close();

	}
}
