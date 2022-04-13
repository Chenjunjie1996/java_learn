package 字符字节流_集合到文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class 文件到集合 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader bfr = new BufferedReader(
				new FileReader("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\copy(jihe).txt"));
		String lineString;
		while ((lineString = bfr.readLine()) != null) {
			list.add(lineString);
		}
		System.out.println(list.toString());

		bfr.close();

		for (String string : list) {
			System.out.println(string);
		}
	}
}
