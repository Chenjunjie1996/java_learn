package 常用API;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer I1 = new Integer(100);
		System.out.println(I1);

		Integer I2 = new Integer("100");
		System.out.println(I2);

		Integer I3 = Integer.valueOf(100);
		System.out.println(I3 + "!");

		Integer I4 = Integer.valueOf("100");
		System.out.println(I4 + "!");
	}
}
