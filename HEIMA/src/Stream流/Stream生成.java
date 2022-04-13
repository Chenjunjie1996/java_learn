package Stream流;

// Stream流 生成方式

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Stream生成 {
	public static void main(String[] args) {
		// Collection
		List<String> list = new ArrayList<String>();
		Stream<String> listStream = list.stream();
		Set<String> set = new HashSet<String>();
		Stream<String> setStream = set.stream();
		// Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		Stream<String> keyStream = map.keySet().stream();
		Stream<Integer> valueStream = map.values().stream();
		Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
		// 数组
		String[] strArray = { "hello", "world", "python" };
		Stream<String> strArrayStream = Stream.of(strArray);
		Stream<String> strArrayStream1 = Stream.of("hello", "world", "python");
		Stream<Integer> IntArrayStream = Stream.of(1, 2, 3);
	}
}
