package 修饰符;

public class Static {
	public String name;
	public int age;
	public static String university; // STATIC 共享

	public void show() {
		System.out.println(name + ", " + age + ", " + university);
	}
}
