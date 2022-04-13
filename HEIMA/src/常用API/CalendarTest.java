package 常用API;

import java.util.Calendar;
import java.util.Scanner;

// 二月天
public class CalendarTest {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("input year");
		int year = SC.nextInt();
		// 设置日历对象的年月日
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		// 3月1日往前推一天就是二月最后一天
		c.add(Calendar.DATE, -1);
		// 获取
		int date = c.get(Calendar.DATE);

		System.out.println(year + "年的2月有" + date + "天");
	}
}
