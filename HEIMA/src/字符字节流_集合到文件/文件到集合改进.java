package 字符字节流_集合到文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class 文件到集合改进 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(
				new FileReader("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\student.txt"));
		ArrayList<Student> list = new ArrayList<Student>();

		String lineString;
		while ((lineString = bfr.readLine()) != null) {
			String[] strarr = lineString.split(",");
			Student s = new Student();
			s.setSid(strarr[0]);
			s.setName(strarr[1]);
			s.setAge(strarr[2]);
			s.setAdd(strarr[3]);
			list.add(s);
		}
		bfr.close();

		for (Student sss : list) {
			System.out.println(sss.toString());
		}
	}
}
