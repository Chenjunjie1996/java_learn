package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class 数据结构 {
	public static void main(String[] args) {
		// 栈和队列

		// 数组 查询快 ArrayList
		// 链表 增删快 LinkedList

		ArrayList<String> Alist = new ArrayList<String>();
		Alist.add("hello");
		Alist.add("world");
		Alist.add("java");

		// 遍历
		Iterator<String> Ait = Alist.iterator();
		while (Ait.hasNext()) {
			String string = (String) Ait.next();
			System.out.println(string);
		}

		for (int i = 0; i < Alist.size(); i++) {
			System.out.println(Alist.get(i));
		}

		for (String string : Alist) {
			System.out.println(string);
		}
		System.out.println("-------------");

		LinkedList<String> Llist = new LinkedList<String>();
		Llist.add("hello");
		Llist.add("world");
		Llist.add("python");

		Iterator<String> Lit = Llist.iterator();
		while (Lit.hasNext()) {
			String string = (String) Lit.next();
			System.out.println(string);
		}

		for (int i = 0; i < Llist.size(); i++) {
			String s = Llist.get(i);
			System.out.println(s);
		}

		for (String string : Llist) {
			System.out.println(string);
		}
	}
}
