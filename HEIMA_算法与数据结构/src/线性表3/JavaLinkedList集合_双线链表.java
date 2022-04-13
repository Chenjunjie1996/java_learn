package 线性表3;

import java.util.LinkedList;

// LinkedList 集合底层是双向链表。

public class JavaLinkedList集合_双线链表 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());

	}
}
