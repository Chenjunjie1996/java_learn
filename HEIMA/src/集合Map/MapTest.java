package 集合Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student S1 = new Student("a", "001", 11);
		Student S2 = new Student("b", "002", 12);
		Student S3 = new Student("c", "003", 13);
		map.put(S1.getStudent_id(), S1);
		map.put(S2.getStudent_id(), S2);
		map.put(S3.getStudent_id(), S3);
		// 遍历1
		for (Map.Entry<String, Student> entry : map.entrySet()) {
			String key = entry.getKey();
			Student val = entry.getValue();
			System.out.println(key + " : " + val);
		}
		System.out.println("----------------------------");
		// 遍历2
		Set<String> keys = map.keySet();
		for (String string : keys) {
			Student values = map.get(string);
			System.out.println(string + " : " + values);
		}
	}
}
