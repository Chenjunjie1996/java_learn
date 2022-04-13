package 多态;

public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}

	public void play() {
		System.out.println("猫追球");
	}
}
