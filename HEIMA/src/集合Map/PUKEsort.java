package 集合Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PUKEsort {
	public static void main(String[] args) {
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] colors = { "♦", "♥", "♠", "♣" };
		String[] nums = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

		int index = 0;
		for (String num : nums) {
			for (String color : colors) {
				HM.put(index, color + num);
				arr.add(index);
				index++;
			}
		}
		HM.put(index, "SK");
		arr.add(index);
		index++;
		HM.put(index, "BK");
		arr.add(index);
		System.out.println(HM);

		Collections.shuffle(arr);

		TreeSet<Integer> A = new TreeSet<Integer>();
		TreeSet<Integer> B = new TreeSet<Integer>();
		TreeSet<Integer> C = new TreeSet<Integer>();
		TreeSet<Integer> DP = new TreeSet<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			Integer poker = arr.get(i);
			if (i >= arr.size() - 3) {
				DP.add(poker);
			} else if (i % 3 == 0) {
				A.add(poker);
			} else if (i % 3 == 1) {
				B.add(poker);
			} else if (i % 3 == 2) {
				C.add(poker);
			}
		}
		checkpoker("A", A, HM);
		checkpoker("B", B, HM);
		checkpoker("C", C, HM);
		checkpoker("DP", DP, HM);
	}

	public static void checkpoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> HM) {
		System.out.print(name);
		for (Integer index : ts) {
			System.out.print(" : " + HM.get(index) + ", ");
		}
		System.out.println();
	}
}
