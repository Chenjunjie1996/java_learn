package 字符字节流_集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class 集合到文件 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\copy(jihe).txt"));
		for (String string : arrayList) {
			bfw.write(string);
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
	}
}
