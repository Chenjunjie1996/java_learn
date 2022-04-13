package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class Stuent_manage {
	public static void main(String[] args) {
		ArrayList<Student_m> array = new ArrayList<Student_m>();
		while (true) {
			System.out.println("WELCOME TO STUDENT MANAGE SYSTEM");
			System.out.println("1 add ");
			System.out.println("2 del ");
			System.out.println("3 update ");
			System.out.println("4 view");
			System.out.println("5 exit ");

			Scanner SC = new Scanner(System.in);
			String Line = SC.nextLine();

			switch (Line) {
			case "1":
				addStudent(array);
				break;
			case "2":
				delStudent(array);
				break;
			case "3":
				updateStudent(array);
				break;
			case "4":
				searchStudent(array);
				break;
			case "5":
				System.out.println("thx for using");
				System.exit(0);
			}
		}
	}

	// 增
	public static void addStudent(ArrayList<Student_m> array) {
		Scanner SC = new Scanner(System.in);

		System.out.println("input student's name");
		String stu_name = SC.nextLine();
		System.out.println("input student's age");
		String stu_age = SC.nextLine();
		System.out.println("input student's id");
		String stu_id = SC.nextLine();
		System.out.println("input student's address");
		String stu_add = SC.nextLine();

		Student_m S = new Student_m();
		S.setName(stu_name);
		S.setAge(stu_age);
		S.setID(stu_id);
		S.setAddress(stu_add);

		array.add(S);
		System.out.println("input successfully");
	}

	// 删
	public static void delStudent(ArrayList<Student_m> array) {
		Scanner SC = new Scanner(System.in);
		System.out.println("input delete student's name");
		String target_name = SC.nextLine();

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getName().equals(target_name)) {
				array.remove(i);
				System.out.println("delete successfully");
				break;
			}
		}
	}

	// 改
	public static void updateStudent(ArrayList<Student_m> array) {
		Scanner SC = new Scanner(System.in);
		System.out.println("input update student's id");
		String sid = SC.nextLine();
		System.out.println("input you want to undate name");
		String name = SC.nextLine();
		System.out.println("input you want to undate age");
		String age = SC.nextLine();
		System.out.println("input you want to undate address");
		String address = SC.nextLine();

		Student_m S = new Student_m();
		S.setID(sid);
		S.setName(name);
		S.setAge(age);
		S.setAddress(address);

		for (int i = 0; i < array.size(); i++) {
			Student_m stu_s = array.get(i);
			if (stu_s.getID().equals(sid)) {
				array.set(i, S);
				break;
			}
		}
		System.out.println("update successfully");
	}

	// 查
	public static void searchStudent(ArrayList<Student_m> array) {
		for (int i = 0; i < array.size(); i++) {
			Student_m Stu = array.get(i);
			System.out.println("name: " + Stu.getName() + ", " + "age: " + Stu.getAge() + ", " + "ID: " + Stu.getID()
					+ ", " + "address: " + Stu.getAddress());
		}
	}

	// 判断学号是否使用
	public static boolean isused(ArrayList<Student_m> array, String sid) {
		boolean flag = false;
		for (int i = 0; i < array.size(); i++) {
			Student_m S = array.get(i);
			if (S.getID().equals(sid)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
