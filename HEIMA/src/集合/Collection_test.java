package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_test {
	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		Student s1 = new Student("a", 10);
		Student s2 = new Student("b", 9);
		Student s3 = new Student("c", 8);
		c.add(s1);
		c.add(s2);
		c.add(s3);

		Iterator<Student> it = c.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}
}
