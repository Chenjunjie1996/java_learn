package 修饰符;

public class StaticDemo {
	public static void main(String[] args) {

		Static.university = "BJ university";

		Static aS = new Static();
		aS.name = "xiaohong";
		aS.age = 20;
		aS.show();

		Static aS_1 = new Static();
		aS_1.name = "xiaohuang";
		aS_1.age = 25;
		aS_1.show();
	}
}
