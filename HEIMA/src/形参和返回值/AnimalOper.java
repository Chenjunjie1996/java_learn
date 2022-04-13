package 形参和返回值;

public class AnimalOper {
	public void useAnimal(Animal A) {
		A.eat();
	}

	public Animal getAnimal() {
		Animal A = new AnimalZi();
		return A;
	}
}
