package 形参和返回值;

public class AnimalDemo {
	public static void main(String[] args) {
		AnimalOper ao = new AnimalOper();
		Animal a1 = new AnimalZi();
		ao.useAnimal(a1);

		Animal a2 = ao.getAnimal();
		a2.eat();
	}
}
