package 类加载器;

public class ClassLoaderDemo {
	public static void main(String[] args) {
		ClassLoader c = ClassLoader.getSystemClassLoader();
		ClassLoader c2 = c.getParent();
		ClassLoader c3 = c2.getParent();
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c.getClass());

	}

}
