package 集合;

import java.util.Random;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();

		while (set.size() < 10) {
			int num = r.nextInt(20) + 1;
			set.add(num);
		}

		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
