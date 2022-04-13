package 字符字节流_集合到文件;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void start() {
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("input number");
			int guessnumber = scanner.nextInt();

			if (guessnumber > number) {
				System.out.println("大了");
			} else if (guessnumber < number) {
				System.out.println("小了");
			} else {
				System.out.println("中了");
				break;
			}
		}
	}
}
