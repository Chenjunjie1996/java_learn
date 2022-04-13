package _API;

public class StringDemo1 {
	public static void main(String[] args) {
		// 创建空白字符串对象
		String s1 = new String();

		// 字符数组
		char[] chs = { 'a', 'b', 'c' };
		String s2 = new String(chs);
		System.out.println(s2);

		// 字节数组
		byte[] bys = { 97, 98, 99 };
		String s3 = new String(bys);
		System.out.println(s3);

		// 直接创建 推荐！
		String s4 = new String("abc");
		System.out.println(s4);

		// string 对象特点
		char[] chs1 = { 'a', 'b', 'c' };
		String s11 = new String(chs1);
		String s22 = new String(chs1);
		System.out.println(s11 == s22);

		String s33 = "abc";
		String s44 = "abc";
		System.out.println(s33 == s44);
	}
}
