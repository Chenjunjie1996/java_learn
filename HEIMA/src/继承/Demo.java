package 继承;

public class Demo {
	public static void main(String[] args) {
		Teacher T1 = new Teacher();
		T1.setName("huan");
		T1.setAge(35);
		System.out.println(T1.getName() + ", " + T1.getAge());
		T1.teach();

		Teacher T2 = new Teacher("guo", 20);
		System.out.println(T2.getName() + ", " + T2.getAge());
		T2.teach();

		Student Stu_1 = new Student();
		Stu_1.setName("xh");
		Stu_1.setAge(15);
		System.out.println(Stu_1.getName() + ", " + Stu_1.getAge());
		Stu_1.learn();

		Student Stu_2 = new Student("huang", 12);
		System.out.println(Stu_2.getName() + ", " + Stu_2.getAge());
		Stu_2.learn();
	}
}
