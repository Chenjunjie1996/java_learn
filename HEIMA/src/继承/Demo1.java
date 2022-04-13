package 继承;

public class Demo1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("xiaohuang");
		d1.setAge(5);
		System.out.println(d1.getName() + ", " + d1.getAge());
		d1.Door();

		Dog d2 = new Dog("xiaolv", 4);
		System.out.println(d1.getName() + ", " + d1.getAge());
		d2.Door();

		Cat c1 = new Cat();
		c1.setName("xiaohua");
		c1.setAge(3);
		System.out.println(c1.getName() + ", " + c1.getAge());
		c1.Catch();

		Cat c2 = new Cat("xiaohui", 2);
		System.out.println(c2.getName() + ", " + c2.getAge());
		c2.Catch();
	}
}
