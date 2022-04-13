package _API;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Bianli1 {
	public static void main(String[] args) {
		ArrayList<Student> Stu_array = new ArrayList<Student>();
		addSTU(Stu_array);
		addSTU(Stu_array);
		addSTU(Stu_array);

		for (int i = 0; i < Stu_array.size(); i++) {
			Student student_s = Stu_array.get(i);
			System.out.println(student_s.getName() + ", " + student_s.getAge());
		}
	}

	public static void addSTU(ArrayList<Student> array) {
		Scanner SC = new Scanner(System.in);
		System.out.println("input  student's name");
		String S_NAME = SC.nextLine();
		System.out.println("input  student's age");
		int S_AGE = SC.nextInt();

		Student STU = new Student();
		STU.setName(S_NAME);
		STU.setAge(S_AGE);
		array.add(STU);

	}
}
