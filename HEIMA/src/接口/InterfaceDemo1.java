package 接口;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Inter I = new InterImpl();

		// I.num = 20;
		System.out.println(I.num);

		// I.num2 = 40;
		System.out.println(I.num2);
	}
}
