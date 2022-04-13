package 集合Map;

import java.util.ArrayList;
import java.util.Collections;

public class PUKE {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		String[] colors = { "♦", "♥", "♠", "♣" };
		String[] nums = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		for (String color : colors) {
			for (String num : nums) {
				arr.add(color + num);
			}
		}
		arr.add("sk");
		arr.add("bk");
		// System.out.println(arr);
		Collections.shuffle(arr);
		// System.out.println(arr);
		ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();
		ArrayList<String> C = new ArrayList<String>();
		ArrayList<String> dp = new ArrayList<String>();

		for (int i = 0; i < arr.size(); i++) {
			String poker = arr.get(i);
			if (i >= arr.size() - 3) {
				dp.add(poker);
			} else if (i % 3 == 0) {
				A.add(poker);
			} else if (i % 3 == 1) {
				B.add(poker);
			} else if (i % 3 == 2) {
				C.add(poker);
			}
		}
		checkpoker("A", A);
		checkpoker("B", B);
		checkpoker("C", C);
		checkpoker("DP", dp);

	}

	public static void checkpoker(String name, ArrayList<String> array) {
		for (String string : array) {
			System.out.print(string + ",");
		}
		System.out.println();
	}
}
