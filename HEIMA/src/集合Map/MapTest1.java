package 集合Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> hm1 = new HashMap<String, String>();
		HashMap<String, String> hm2 = new HashMap<String, String>();
		HashMap<String, String> hm3 = new HashMap<String, String>();

		hm1.put("sunce", "daqiao");
		hm1.put("zhouyu", "xiaoqiao");
		hm2.put("guojing", "huangrong");
		hm2.put("yanguo", "xiaolongnv");
		hm3.put("linghuchong", "renyingying");
		hm3.put("linpingzhi", "yuelingshan");

		array.add(hm1);
		array.add(hm2);
		array.add(hm3);

		for (HashMap<String, String> hashMap : array) {
			Set<String> keySet = hashMap.keySet();
			for (String key : keySet) {
				String value = hashMap.get(key);
				System.out.println(key + " : " + value);
			}
		}
	}
}
