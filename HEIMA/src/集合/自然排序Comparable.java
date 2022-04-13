package 集合;

import java.util.TreeSet;

// student类重写comparable

public class 自然排序Comparable {
	public static void main(String[] args) {

		TreeSet<Student> TRST = new TreeSet<Student>();
		Student S1 = new Student("xishi", 29);
		Student S2 = new Student("diaochan", 30);
		Student S3 = new Student("yangyuhuan", 33);
		Student S4 = new Student("wangzhaojun", 15);
		Student S5 = new Student("linqingxia", 33);
		TRST.add(S1);
		TRST.add(S2);
		TRST.add(S3);
		TRST.add(S4);
		TRST.add(S5);
		for (Student student : TRST) {
			System.out.println(student);
		}
	}
}
