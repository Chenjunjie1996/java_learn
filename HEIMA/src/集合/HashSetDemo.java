package 集合;
// hashSet 实现set接口

// 底层数据结构是哈希表

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> HS = new HashSet<String>();
		HS.add("hello");
		HS.add("world");
		HS.add("java");
		HS.add("world");

		for (String string : HS) {
			System.out.println(string);
		}

		HashSet<Student> hss = new HashSet<Student>();
		Student S1 = new Student("a", 10);
		Student S2 = new Student("b", 11);
		Student S3 = new Student("c", 12);
		Student S4 = new Student("c", 12);
		hss.add(S1);
		hss.add(S2);
		hss.add(S3);
		hss.add(S4);
		for (Student student : hss) {
			System.out.println(student);
		}
	}
}
