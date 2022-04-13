package 关系案例_教练运动员;

public class Demo {
	public static void main(String[] args) {
		BasketballPlayer aPlayer = new BasketballPlayer("yaoming", 35);
		System.out.println(aPlayer.getName() + ", " + aPlayer.getAge());
		aPlayer.eat();
		aPlayer.learn();
		aPlayer.learnEng();

		BasketCoach aCoach = new BasketCoach("KOBO", 35);
		System.out.println(aCoach.getName() + ", " + aCoach.getAge());
		aCoach.eat();
		aCoach.teach();
		aCoach.learnEng();
	}
}
