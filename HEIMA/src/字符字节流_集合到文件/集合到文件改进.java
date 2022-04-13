package 字符字节流_集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class 集合到文件改进 {
	public static void main(String[] args) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student("a", "1", "1", "e");
		Student s2 = new Student("b", "2", "2", "w");
		Student s3 = new Student("c", "3", "3", "s");
		Student s4 = new Student("d", "4", "4", "n");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\copy(student).txt"));
		for (Student student : list) {
			bfw.write(student.toString());
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
	}
}
