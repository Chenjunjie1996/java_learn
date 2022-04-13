package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// list 有序：存储和取出的元素顺序一致 可重复
// 特有方法 add remove set get
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("hello");
		System.out.println(list);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("-------------------------");
		list.add(3, "c++");
		list.remove(4);
		System.out.println(list);
		list.set(2, "python");
		System.out.println(list);
		System.out.println(list.get(2));
	}
}
