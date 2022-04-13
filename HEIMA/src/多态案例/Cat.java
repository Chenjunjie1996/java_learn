package 多态案例;

public class Cat extends Animal {

	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");

	}
}
