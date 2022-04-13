package _API;

import java.util.ArrayList;

public class Stu_Bianli {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student S1 = new Student("a", 30);
		Student S2 = new Student("b", 20);
		Student S3 = new Student("c", 15);

		arrayList.add(S1);
		arrayList.add(S2);
		arrayList.add(S3);

		for (int i = 0; i < arrayList.size(); i++) {
			Student S = arrayList.get(i);
			System.out.println(S.getName() + ", " + S.getAge());
		}
	}
}
