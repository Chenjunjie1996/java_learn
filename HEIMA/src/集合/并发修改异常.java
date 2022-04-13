package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 并发修改异常 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");

		Iterator<String> it = list.iterator();
		boolean flag = false;
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			if (s.equals("world")) {
				flag = true;
			}
		}
		if (flag == true) {
			list.add("javaee");
			System.out.println(list);
		}

		for (int i = 0; i < list.size(); i++) {
			String ss = list.get(i);
			if (ss.equals("world")) {
				list.add("python");
			}
		}
		System.out.println(list);
	}
}
