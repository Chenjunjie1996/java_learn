package _API;

// STRING STRINGBUILDER
public class Convert {
	public static void main(String[] args) {
		// STRINGBUILDER to string
		StringBuilder SB = new StringBuilder();
		SB.append("a").append("b").append("c");
		String s = SB.toString();
		System.out.println(s);

		// STRING TO String builder
		String s1 = "Hello";
		StringBuilder SB_01 = new StringBuilder(s1);
		System.out.println(SB_01);

	}
}
