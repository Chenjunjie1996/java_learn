package 多态;

/* 
 *	多态： 同一个对象，在不同时刻表现出的不同形态
 *	多态的前提和实现：
 *	有继承/实现关系，	有方法重写，	有父类引用指向子类对象。
 */

public class AnimalDemo {
	public static void main(String[] args) {
		Animal A = new Cat();
		Animal B = new Animal();
		A.eat();
		B.eat();
		((Cat) A).play(); // 多态转型 访问子类的方法
		AnimalOperate ao = new AnimalOperate();
		Dog D = new Dog();
		ao.useAnimal(D);
	}
}
