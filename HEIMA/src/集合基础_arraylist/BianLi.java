package 集合基础_arraylist;

import java.util.ArrayList;

public class BianLi {
	public static void main(String[] args) {
		ArrayList<String> array_List = new ArrayList<String>();
		array_List.add("a");
		array_List.add("b");
		array_List.add("c");

		for (int i = 0; i < array_List.size(); i++) {
			String s1 = array_List.get(i);
			System.out.println(s1);
		}
	}
}
