package 集合Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		List<StudentCs> list = new ArrayList<StudentCs>();
		StudentCs S1 = new StudentCs("a", 10);
		StudentCs S2 = new StudentCs("b", 11);
		StudentCs S3 = new StudentCs("c", 12);
		StudentCs S4 = new StudentCs("d", 8);
		StudentCs S5 = new StudentCs("e", 9);
		StudentCs S6 = new StudentCs("f", 10);
		list.add(S1);
		list.add(S2);
		list.add(S3);
		list.add(S4);
		list.add(S5);
		list.add(S6);

		// System.out.println(list);

		Collections.sort(list, new Comparator<StudentCs>() {

			@Override
			public int compare(StudentCs o1, StudentCs o2) {
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}
		});

		for (StudentCs studentCs : list) {
			System.out.println(studentCs);
		}
	}
}
