package Operator;

public class operator_Demo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println(max);

		int weight1 = 180;
		int weight2 = 200;
		boolean c = weight1 == weight2 ? true : false;
		System.out.println(c);

		int height1 = 150;
		int height2 = 210;
		int height3 = 165;
		int tempheight = height1 > height2 ? height1 : height2;
		int maxheight = tempheight > height3 ? tempheight : height3;
		System.out.println(maxheight);
	}
}
