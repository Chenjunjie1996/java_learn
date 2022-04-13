package 集合;

import java.util.Comparator;
import java.util.TreeSet;

public class 比较器排序Comparator {
	public static void main(String[] args) {
		TreeSet<Student> TS = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}
		});
		Student S1 = new Student("xishi", 29);
		Student S2 = new Student("diaochan", 30);
		Student S3 = new Student("yangyuhuan", 33);
		Student S4 = new Student("wangzhaojun", 15);
		Student S5 = new Student("linqingxia", 33);
		TS.add(S1);
		TS.add(S2);
		TS.add(S3);
		TS.add(S4);
		TS.add(S5);

		for (Student student : TS) {
			System.out.println(student);
		}
	}
}
