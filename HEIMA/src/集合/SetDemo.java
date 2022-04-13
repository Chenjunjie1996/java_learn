package 集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// extends collection 不重复 没索引
// 常用方法 add remove clear contains isEmpty size
// hashSet 对集合迭代顺序不保证
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("world");

		for (String string : set) {
			System.out.println(string);
		}

		Iterator<String> IT = set.iterator();
		while (IT.hasNext()) {
			String string = (String) IT.next();
			System.out.println(string);
		}
	}
}
