package 异常;

import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("input score");
		int score = SC.nextInt();
		Teacher t1 = new Teacher();
		try {
			t1.checkScore(score);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkScore(int score) throws ScoreException {
		if (score < 0 || score > 100) {
			throw new ScoreException("分数异常");
		} else {
			System.out.println("normal score");
		}
	}
}
