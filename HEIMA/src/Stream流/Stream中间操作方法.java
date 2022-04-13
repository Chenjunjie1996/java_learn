package Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream中间操作方法 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("aa");
		Stream<String> stream = list.stream();
		// filter
		stream.filter(s -> s.startsWith("a")).filter(s -> s.length() == 2).forEach(System.out::print);
		System.out.println();
		// limit 取前几个
		Stream<String> stream1 = list.stream();
		stream1.limit(3).forEach(System.out::print);
		System.out.println();
		// skip 跳过
		Stream<String> stream2 = list.stream();
		stream2.skip(2).forEach(System.out::print);
		System.out.println();
		// concat 合并两个流
		Stream<String> stream3 = list.stream().limit(2);
		Stream<String> stream4 = list.stream().skip(2);
		Stream.concat(stream3, stream4).forEach(System.out::print);
		System.out.println();
		// distinct
		Stream<String> stream5 = list.stream().limit(2);
		Stream<String> stream6 = list.stream().skip(2);
		Stream.concat(stream5, stream6).distinct().forEach(System.out::print);
		System.out.println();
		// sorted
		list.stream().sorted().forEach(System.out::print);
		System.out.println();
		list.stream().sorted((s1, s2) -> {
			int num = s1.length() - s2.length();
			int num2 = num == 0 ? s2.compareTo(s1) : num;
			return num2;
		}).forEach(System.out::print);
		System.out.println();
		// map
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("10");
		alist.add("20");
		alist.add("30");
		alist.add("40");
		alist.add("50");
		alist.stream().map(s -> Integer.parseInt(s)).forEach(System.out::print);
		System.out.println();
		// mapToInt 返回intStream
		int sum = alist.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
	}
}
