package 形参和返回值;

// 类名作为形参和返回值

public class CatDemo {
	public static void main(String[] args) {
		CatOper oper = new CatOper();
		Cat C = new Cat();
		oper.useCat(C);

		Cat c2 = oper.getCat();
		c2.eat();
	}
}
