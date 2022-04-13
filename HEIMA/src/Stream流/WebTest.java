package Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WebTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);

		list.stream().filter(x -> x > 6).forEach(System.out::print);
		System.out.println();
		Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
		// 匹配任意（适用于并行流）
		Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();
		boolean anyMatch = list.stream().anyMatch(x -> x > 6);
		System.out.println(anyMatch);
		System.out.println(findFirst.get());
		System.out.println(findAny.get());

		// 工资高于8000的员工姓名
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Tom", 8900, 23, "male", "New York"));
		personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
		personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
		personList.add(new Person("Anni", 8200, 24, "female", "New York"));
		personList.add(new Person("Owen", 9500, 25, "male", "New York"));
		personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
		List<String> filterlist = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName)
				.collect(Collectors.toList());
		System.out.println(filterlist);

		// 最长元素
		List<String> list1 = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
		list1.stream().sorted((s1, s2) -> {
			int num = s2.length() - s1.length();
			int num2 = num == 0 ? s2.compareTo(s1) : num;
			return num2;
		}).count();
		Optional<String> max = list1.stream().max(Comparator.comparing(String::length));
		System.out.println(max);

		// 最大值
		List<Integer> list2 = Arrays.asList(7, 6, 9, 4, 11, 6);
		Optional<Integer> max1 = list2.stream().max(Integer::compareTo);
		Optional<Integer> max2 = list2.stream().max(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println(max1);
		System.out.println(max2);

		// 工资最高
		Optional<Person> max3 = personList.stream().max(Comparator.comparingInt(Person::getSalary));
		System.out.println(max3.get());

		// 计算个数
		List<Integer> list4 = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
		long ct = list4.stream().filter(i -> i > 6).count();
		System.out.println(ct);

		// 映射
		String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
		List<String> uplist = Stream.of(strArr).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uplist);
		List<Integer> inList = Stream.of(1, 3, 5, 7, 9, 11).map(x -> x + 3).collect(Collectors.toList());
		System.out.println(inList);

		// 员工薪资全+1000
		List<Integer> collect = personList.stream().map(person -> {
			return person.getSalary() + 1000;
		}).collect(Collectors.toList());
		System.out.println(collect);

		// 字符数组合并
		List<String> strlist = Arrays.asList("m,k,l,a", "1,3,5,7");
		List<String> new_strlist = strlist.stream().flatMap(s -> {
			String[] split = s.split(",");
			Stream<String> s2 = Arrays.stream(split);
			return s2;
		}).collect(Collectors.toList());
		System.out.println(new_strlist);

		// integer
		List<Integer> Ilist = Arrays.asList(1, 3, 2, 8, 11, 4);
		Optional<Integer> sum = Ilist.stream().reduce(Integer::sum);
		Optional<Integer> product = Ilist.stream().reduce((x, y) -> x * y);
		Optional<Integer> Imax = Ilist.stream().reduce((x, y) -> x > y ? x : y);
		System.out.println(sum.get());
		System.out.println(product.get());
		System.out.println(Imax.get());

		// 员工工资之和 和 最高工资
		Optional<Integer> sum1 = personList.stream().map(Person::getSalary).reduce(Integer::sum);
		System.out.println(sum1);
		Optional<Integer> Imax1 = personList.stream().map(Person::getSalary).reduce((x, y) -> x > y ? x : y);
		System.out.println(Imax1);

		// Collect
		List<Integer> InList = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
		List<Integer> InListnew = InList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(InListnew);
		Set<Integer> InSet = InList.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
		System.out.println(InSet);
		Map<String, Integer> InMap = personList.stream()
				.collect(Collectors.toMap(s -> s.getName(), s -> s.getSalary()));
		System.out.println(InMap);

		// 统计
		Long counting = personList.stream().collect(Collectors.counting());
		System.out.println(counting);
		Double aver = personList.stream().collect(Collectors.averagingLong(Person::getSalary));
		System.out.println(aver);
		Integer Sum = personList.stream().collect(Collectors.summingInt(Person::getSalary));
		System.out.println(Sum);
		DoubleSummaryStatistics doubleSummaryStatistics = personList.stream()
				.collect(Collectors.summarizingDouble(Person::getSalary));
		System.out.println(doubleSummaryStatistics);

		// 分组
		Map<Boolean, List<Person>> partby = personList.stream()
				.collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
		System.out.println(partby);
		Map<String, List<Person>> gpby = personList.stream().collect(Collectors.groupingBy(Person::getSex));
		System.out.println(gpby);
		Map<String, Map<String, List<Person>>> gpby2 = personList.stream()
				.collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
		System.out.println(gpby2);

		// 接合
		String names = personList.stream().map(p -> p.getName()).collect(Collectors.joining(","));
		System.out.println(names);

		// 排序
		String sort_string = personList.stream().sorted(Comparator.comparing(Person::getSalary)).map(Person::getName)
				.collect(Collectors.joining(","));
		System.out.println(sort_string);
		String sort_string1 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed())
				.map(Person::getName).collect(Collectors.joining(","));
		System.out.println(sort_string1);
		List<String> sort_list = personList.stream()
				.sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(Person::getName)
				.collect(Collectors.toList());
		System.out.println(sort_list);

		// 提取/合并
		String[] arr1 = { "a", "b", "c", "d" };
		String[] arr2 = { "d", "e", "f", "g" };
		Stream<String> stream1 = Stream.of(arr1);
		Stream<String> stream2 = Stream.of(arr2);
		List<String> streamconcat = Stream.concat(stream1, stream2).distinct().collect(Collectors.toList());
		System.out.println(streamconcat);

		List<Integer> Iter1 = Stream.iterate(1, x -> x + 2).limit(10).collect(Collectors.toList());
		System.out.println(Iter1);
		List<Integer> Iter2 = Stream.iterate(1, x -> x * 2).skip(1).limit(5).collect(Collectors.toList());
		System.out.println(Iter2);
	}
}
