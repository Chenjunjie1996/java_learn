package 集合Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest3 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("input chara");
		String Charas = sc1.nextLine();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < Charas.length(); i++) {
			// System.out.println(Charas.charAt(i));
			char key = Charas.charAt(i);
			Integer value = hm.get(key);

			if (value == null) {
				hm.put(key, 1);
			} else {
				value++;
				hm.put(key, value);
			}
		}

		/*
		 * Map<Character, Integer> resmap = new TreeMap<Character, Integer>(new
		 * Comparator<Integer>() { public int compare(Integer obj1, Integer obj2) {
		 * return obj2.compareTo(obj1); } });
		 */

		StringBuilder SB = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			SB.append(key + "(" + val + ")");
		}
		System.out.println(SB);
	}

}
