package 集合Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;

// TreeMap 对键排序

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("input strings");
		String line = SC.nextLine();

		TreeMap<Character, Integer> HM = new TreeMap<Character, Integer>();

		for (int i = 0; i < line.length(); i++) {
			Character ch = line.charAt(i);
			Integer val = HM.get(ch);
			if (val == null) {
				HM.put(ch, 1);
			} else {
				val++;
				HM.put(ch, val);
			}
		}
		LinkedHashMap<Character, Integer> TMD = sortValue(HM);

		StringBuilder SB = new StringBuilder();
		for (Entry<Character, Integer> entry : TMD.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			SB.append(key).append("(").append(val).append(")");
		}
		String Res = SB.toString();
		System.out.println(Res);

	}

	// SORT
	public static LinkedHashMap<Character, Integer> sortValue(TreeMap<Character, Integer> map) {
		LinkedHashMap<Character, Integer> TMD = new LinkedHashMap<Character, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Character> listkey = new ArrayList<Character>();
		Set<Character> keySet = map.keySet();
		for (Character key : keySet) {
			list.add(map.get(key));
			listkey.add(key);
		}
		int temp = 0;
		Character tempkey = 'a';
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j + 1) > list.get(j)) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

					tempkey = listkey.get(j);
					listkey.set(j, listkey.get(j + 1));
					listkey.set(j + 1, tempkey);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			TMD.put(listkey.get(i), list.get(i));
		}
		return TMD;
	}
}
