package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//常用方法 add remove clear contains isEmpty size
//集合遍历 iterator

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println(c);

		c.remove("java");
		System.out.println(c);

		boolean a = c.contains("hello");
		System.out.println(a);

		boolean b = c.isEmpty();
		System.out.println(b);

		int L = c.size();
		System.out.println(L);

		c.clear();
		System.out.println(c);

		// Iterator
		Collection<String> cc = new ArrayList<String>();
		cc.add("hello");
		cc.add("world");
		cc.add("java");
		Iterator<String> it = cc.iterator();

		// 遍历
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
//		System.out.println(IT.next());
//		System.out.println(IT.next());
//		System.out.println(IT.hasNext());
//		System.out.println(IT.next());
//		System.out.println(IT.hasNext());
	}

}
