package 函数式接口;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		// 匿名内部类
		ArrayList<String> array = new ArrayList<String>();
		array.add("cccc");
		array.add("aa");
		array.add("b");
		array.add("ddd");
		System.out.println("排序前：" + array);
		Collections.sort(array);
		System.out.println("自然顺序排序后：" + array);
		Collections.sort(array, getComparator());
		System.out.println("长度排序：" + array);
	}

	private static Comparator<String> getComparator() {
		// 匿名内部类
//		Comparator<String> comp = new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				// TODO Auto-generated method stub
//				return s1.length() - s2.length();
//			}
//		};
//		return comp

//		return new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				// TODO Auto-generated method stub
//				return s1.length() - s2.length();
//			}
//		};

//		return (String s1, String s2) -> {
//			return s1.length() - s2.length();
//		};

		return (s1, s2) -> s1.length() - s2.length();
	}
}
