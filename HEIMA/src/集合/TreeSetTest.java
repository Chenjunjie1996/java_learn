package 集合;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<StudentScore> SS = new TreeSet<StudentScore>();
		StudentScore S1 = new StudentScore("a", 66, 77);
		StudentScore S2 = new StudentScore("b", 88, 90);
		StudentScore S3 = new StudentScore("c", 90, 91);
		StudentScore S4 = new StudentScore("d", 77, 66);
		SS.add(S1);
		SS.add(S2);
		SS.add(S3);
		SS.add(S4);
		for (StudentScore studentScore : SS) {
			System.out.println(studentScore);
		}

		System.out.println("--------------------------------------");

		TreeSet<StudentScore> SS1 = new TreeSet<StudentScore>(new Comparator<StudentScore>() {
			@Override
			public int compare(StudentScore o1, StudentScore o2) {
				int num = o1.getChScore() + o1.getMaScore() - o2.getChScore() - o2.getMaScore();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

				return num2;
			}
		});
		StudentScore s1 = new StudentScore("e", 90, 87);
		StudentScore s2 = new StudentScore("f", 91, 88);
		StudentScore s3 = new StudentScore("g", 88, 80);
		StudentScore s4 = new StudentScore("h", 80, 88);
		SS1.add(s1);
		SS1.add(s2);
		SS1.add(s3);
		SS1.add(s4);
		for (StudentScore studentScore : SS1) {
			System.out.println(studentScore);
		}
		System.out.println("----------------------------");

		TreeSet<StudentScore> SS2 = new TreeSet<StudentScore>(new Comparator<StudentScore>() {

			@Override
			public int compare(StudentScore o1, StudentScore o2) {
				int num = o2.getChScore() + o2.getChScore() - o1.getChScore() - o1.getMaScore();
				int num2 = num == 0 ? o2.getChScore() - o1.getChScore() : num;
				int num3 = num2 == 0 ? o2.getMaScore() - o1.getMaScore() : num2;
				int num4 = num3 == 0 ? o2.getName().compareTo(o1.getName()) : num3;
				return num4;
			}
		});
		StudentScore ss1 = new StudentScore("I", 90, 90);
		StudentScore ss2 = new StudentScore("J", 100, 80);
		StudentScore ss3 = new StudentScore("K", 85, 95);
		StudentScore ss4 = new StudentScore("L", 95, 85);
		StudentScore ss5 = new StudentScore("M", 85, 100);
		SS2.add(ss1);
		SS2.add(ss2);
		SS2.add(ss3);
		SS2.add(ss4);
		SS2.add(ss5);
		for (StudentScore studentScore : SS2) {
			System.out.println(studentScore);
		}
	}
}
