package _API;

import java.util.Scanner;

public class loginSystem {
	public static void main(String[] args) {
		String username = "cjj";
		String password = "1996";

		int logintime = 0;
		while (logintime < 3) {
			Scanner sc_01 = new Scanner(System.in);
			System.out.println("input username");
			String name = sc_01.nextLine();
			System.out.println("input password");
			String pwd = sc_01.nextLine();

			if (name.equals(username) && pwd.equals(password)) {
				System.out.println("login successfully");
				break;
			} else {
				System.out.println("login failed, " + (2 - logintime) + " left.");
				logintime++;
			}
		}
		System.out.println("user locked");
	}
}
