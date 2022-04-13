package 函数式接口;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		String[] strArray = { "xiaohong,30", "xiaolv,34", "xiaohuang,35", "xiaohei,31", "xiaobai,33" };
		ArrayList<String> arr_res = myFilter(strArray, s -> s.split(",")[0].length() == 9,
				s -> Integer.parseInt(s.split(",")[1]) >= 35);
		System.out.println(arr_res);
	}

	private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
		ArrayList<String> array = new ArrayList<String>();

		for (String str : strArray) {
			if (pre1.and(pre2).test(str)) {
				array.add(str);
			}
		}
		return array;
	}

}
