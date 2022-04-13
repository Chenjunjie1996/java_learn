package 字符字节流_集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 集合到文件_数据排序改进 {
	public static void main(String[] args) throws IOException {
		TreeSet<StudentScore> treeSet = new TreeSet<StudentScore>(new Comparator<StudentScore>() {

			@Override
			public int compare(StudentScore o1, StudentScore o2) {
				// TODO Auto-generated method stub
				int num = o2.getSum() - o1.getSum();
				int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
				int num3 = num2 == 0 ? o1.getMath() - o2.getMath() : num2;
				int num4 = num3 == 0 ? o1.getName().compareTo(o2.getName()) : num3;
				return num4;
			}
		});
		for (int i = 0; i < 5; i++) {
			Scanner SC = new Scanner(System.in);
			System.out.println("input" + (i + 1) + "student info");
			System.out.println("name");
			String name = SC.nextLine();
			System.out.println("chinese score");
			int chinese = SC.nextInt();
			System.out.println("math score");
			int math = SC.nextInt();
			System.out.println("english score");
			int english = SC.nextInt();

			StudentScore S = new StudentScore();
			S.setName(name);
			S.setChinese(chinese);
			S.setMath(math);
			S.setEnglish(english);
			treeSet.add(S);
		}
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流\\StudentScore.txt"));
		for (StudentScore studentScore : treeSet) {
			bfw.write(studentScore.toString());
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
	}
}
