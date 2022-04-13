package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 三种方式遍历
public class List_BianliTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("a", 10);
		Student s2 = new Student("b", 9);
		Student s3 = new Student("c", 8);
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 1. 迭代器
		Iterator<Student> itstudent = list.iterator();
		while (itstudent.hasNext()) {
			Student s = itstudent.next();
			System.out.println(s);
		}
		System.out.println("----------------");
		// 2. 索引
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------");

		// 3. 增强for
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
