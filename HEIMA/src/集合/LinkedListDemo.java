package 集合;

import java.util.LinkedList;

// addFirst addLast getFirst getLast removeFirst removeLast

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> LKlist = new LinkedList<String>();
		LKlist.add("Hello");
		LKlist.add("world");
		LKlist.add("python");

		System.out.println(LKlist);

		System.out.println(LKlist.getFirst());
		System.out.println(LKlist.getLast());

		LKlist.addFirst("Hi");
		LKlist.addLast("java");
		System.out.println(LKlist);

		LKlist.removeFirst();
		LKlist.removeLast();
		System.out.println(LKlist);
	}
}
