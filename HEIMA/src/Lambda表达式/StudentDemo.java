package Lambda表达式;

public class StudentDemo {
	public static void main(String[] args) {
		UseStudentBuilder((String name, int age) -> {
			return new Student(name, age);
		});
		UseStudentBuilder((name, age) -> new Student(name, age));

		// 引用构造器
		UseStudentBuilder(Student::new);
	}

	private static void UseStudentBuilder(StudentBuilderInter sb) {
		Student s = sb.build("a", 10);
		System.out.println(s.getName() + "," + s.getAge());
	}
}
