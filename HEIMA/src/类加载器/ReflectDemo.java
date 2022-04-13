package 类加载器;

// 三种方式获取Class对象

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<Student> c1 = Student.class;
		System.out.println(c1);
		Class<Student> c2 = Student.class;
		System.out.println(c1 == c2);
		System.out.println("============");

		Student s = new Student();
		Class<Student> c3 = (Class<Student>) s.getClass();
		System.out.println(c3 == c1);
		System.out.println("==========");

		Class<?> c4 = Class.forName("类加载器.Student");
		System.out.println(c4 == c1);
	}
}
