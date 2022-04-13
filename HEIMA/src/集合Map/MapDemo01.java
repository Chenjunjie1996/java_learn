package 集合Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//增 put 删remove clear 判断containsKey containsValue isEmpty size
// 查 get set collection
public class MapDemo01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("a", 2);
		System.out.println(map);

		map.remove("a");
		System.out.println(map);
		map.clear();
		System.out.println(map);

		map.put("a", 2);
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue(2));
		System.out.println(map.isEmpty());
		System.out.println(map.size());

		System.out.println(map.get("a"));
		Set<String> map1 = map.keySet();
		System.out.println(map1);
		Collection<Integer> map2 = map.values();
		System.out.println(map2);

		// 遍历 1
		map.put("c", 66);
		Set<String> map11 = map.keySet();
		for (String key : map11) {
			Integer value = map.get(key);
			System.out.println(key + "," + value);
		}
		// 遍历 2
		Set<Map.Entry<String, Integer>> map3 = map.entrySet();
		System.out.println(map3);
		for (Map.Entry<String, Integer> entry : map3) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
