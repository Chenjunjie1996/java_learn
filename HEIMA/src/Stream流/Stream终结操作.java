package Stream流;

import java.util.ArrayList;

public class Stream终结操作 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("aa");
		list.stream().forEach(System.out::print);
		System.out.println();

		// count
		long count = list.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(count);
	}

}
