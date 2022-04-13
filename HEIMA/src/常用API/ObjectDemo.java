package 常用API;

// 建议所有类重写 toString方法

public class ObjectDemo {
	public static void main(String[] args) {
		Student S1 = new Student();
		S1.setName("XH");
		S1.setAge(20);
		System.out.println(S1);
		System.out.println(S1.toString());

		Student S2 = new Student();
		S2.setName("XH");
		S2.setAge(20);
		System.out.println(S1 == S2);

		// equal 默认比较地址， 重写可比较内容
		System.out.println(S1.equals(S2));
	}
}
