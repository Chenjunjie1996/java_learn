package 集合Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hs_arr = new HashMap<String, ArrayList<String>>();

		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<String> arr3 = new ArrayList<String>();
		arr1.add("a");
		arr1.add("A");
		arr2.add("b");
		arr2.add("B");
		arr3.add("c");
		arr3.add("C");

		hs_arr.put("hm1", arr1);
		hs_arr.put("hm2", arr2);
		hs_arr.put("hm3", arr3);

		for (Map.Entry<String, ArrayList<String>> entry : hs_arr.entrySet()) {
			String key = entry.getKey();
			ArrayList<String> val = entry.getValue();
			for (String i : val) {
				System.out.println(key + " : " + i);
			}
		}

		Set<String> Keys = hs_arr.keySet();
		for (String Key : Keys) {
			ArrayList<String> Val = hs_arr.get(Key);
			for (String val : Val) {
				System.out.println(Key + " : " + val);
			}
		}
	}
}
