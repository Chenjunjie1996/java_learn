package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("a", 10);
		Student s2 = new Student("b", 9);
		Student s3 = new Student("c", 8);
		list.add(s1);
		list.add(s2);
		list.add(s3);

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}
}
