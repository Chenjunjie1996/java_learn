package 接口跳高案例;

public class Demo {
	public static void main(String[] args) {
		Jummping J = new CAT();
		J.jumpping();
		System.out.println("--------");

		ANIMAL cAnimal = new CAT();
		cAnimal.setName("小花");
		cAnimal.setAge(10);
		System.out.println(cAnimal.getName() + ", " + cAnimal.getAge());
		cAnimal.eat();
		((Jummping) cAnimal).jumpping();

		// 常用

		CAT tCat = new CAT();
		tCat.setName("coffe");
		tCat.setAge(2);
		System.out.println(tCat.getName() + ", " + tCat.getAge());
		tCat.eat();
		tCat.jumpping();

		DOG d = new DOG("xiaohuang", 3);
		System.out.println(d.getName() + ", " + d.getAge());
		d.eat();
		d.jumpping();

	}
}
