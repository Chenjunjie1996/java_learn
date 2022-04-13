package 集合Map;

import java.util.ArrayList;
import java.util.List;

//  针对集合操作的工具类
// sort reverse shuffle(洗牌)

public class Collections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list + "\n" + "------------------------");
		java.util.Collections.sort(list);
		System.out.println(list + "\n" + "------------------------");
		java.util.Collections.reverse(list);
		System.out.println(list + "\n" + "------------------------");
		java.util.Collections.shuffle(list);
		System.out.println(list + "\n" + "------------------------");

	}
}
