package 集合;

import java.util.LinkedHashSet;

// 链表保证有序， 哈希表保证元素唯一

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> LKHS = new LinkedHashSet<String>();
		LKHS.add("hello");
		LKHS.add("world");
		LKHS.add("python");
		LKHS.add("hello");

		for (String string : LKHS) {
			System.out.println(string);
		}
	}
}
