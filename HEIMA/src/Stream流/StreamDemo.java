package Stream流;

import java.util.ArrayList;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("aa");
		ArrayList<String> new_list = new ArrayList<String>();
		ArrayList<String> new_list1 = new ArrayList<String>();
		for (String str : list) {
			if (str.startsWith("a")) {
				new_list.add(str);
				if (str.length() == 2) {
					new_list1.add(str);
				}
			}
		}
		for (String str : new_list1) {
			System.out.println(str);
		}

		System.out.println("======================");
		// Stream流
		list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 2).forEach(System.out::println);
	}
}
