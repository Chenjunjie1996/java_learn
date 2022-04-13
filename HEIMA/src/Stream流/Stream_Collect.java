package Stream流;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Collect {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("林心如");
		list.add("张曼玉");
		list.add("林青霞");
		list.add("柳岩");
		list.add("林志玲");
		list.add("王祖贤");
		Stream<String> listStream = list.stream().filter(s -> s.length() == 3);

		List<String> names = listStream.collect(Collectors.toList());
		System.out.println(names);

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(33);
		set.add(35);
		Stream<Integer> setStream = set.stream().filter(s -> s > 25);
		Set<Integer> ages = setStream.collect(Collectors.toSet());
		System.out.println(ages);

		String[] strArray = { "林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25" };
		Stream<String> astream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

		Map<String, String> a_map = astream.collect(Collectors.toMap(s -> s.split(",")[0], i -> i.split(",")[1]));
		System.out.println(a_map);
		for (Map.Entry<String, String> entry : a_map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.print(key);
			System.out.println(val);

		}
	}
}
