package 多态案例;

public class Dog extends Animal {

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");

	}
}
