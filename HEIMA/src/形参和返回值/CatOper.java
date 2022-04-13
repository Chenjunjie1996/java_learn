package 形参和返回值;

public class CatOper {
	public void useCat(Cat C) {
		C.eat();
	}

	public Cat getCat() {
		Cat C = new Cat();
		return C;
	}
}
