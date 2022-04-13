package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 运行时的问题提前到编译时期
// 避免强制转换

public class 泛型 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("hello");
		c.add("100");

		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
