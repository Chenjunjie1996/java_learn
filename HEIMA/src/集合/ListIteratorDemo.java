package 集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// ListIterator 
// 两头迭代， 迭代时修改列表， 并获取当前位置
// 常用方法 next hasNext previous hasPrevious add

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");

		ListIterator<String> lit = list.listIterator();
		while (lit.hasNext()) {
			String s = lit.next();
			System.out.println(s);
		}
		System.out.println("--------------------");

		while (lit.hasPrevious()) {
			String ss = lit.previous();
			System.out.println(ss);
		}
		System.out.println("-----------------------");

		// ListIterator 可以添加 add ****
		while (lit.hasNext()) {
			String s = lit.next();
			if (s.equals("world")) {
				lit.add("javaee");
			}
			;
		}
		System.out.println(list);
	}
}
