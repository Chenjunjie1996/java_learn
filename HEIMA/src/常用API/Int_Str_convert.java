package 常用API;

public class Int_Str_convert {
	public static void main(String[] args) {
		// INT > STR

		int number = 100;

		// 1
		String S1 = "" + number;
		System.out.println(S1);

		// 2 public static String valueOf (int)
		String S2 = String.valueOf(number);
		System.out.println(S2);
		System.out.println("--------");

		// STR > INT
		String S = "100";

		// 1 Str > Integer > Int
		Integer I1 = Integer.valueOf(S);
		int x = I1.intValue();
		System.out.println(x);

		// 2 public static int parseInt (String s)
		int y = Integer.parseInt(S);
		System.out.println(y);
	}
}
