package 常用API;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar CAL = Calendar.getInstance(); // 多态形式
		System.out.println(CAL.getWeekYear());

//		常用方法 get add set
		// get
		int year = CAL.get(Calendar.YEAR);
		int month = CAL.get(Calendar.MONTH) + 1;
		int day = CAL.get(Calendar.DATE);
		System.out.println(year + "年" + month + "月" + day + "日");

		// add
		CAL.add(Calendar.YEAR, -3);
		System.out.println(CAL.get(Calendar.YEAR));
		CAL.add(Calendar.MONTH, -3);
		System.out.println(CAL.get(Calendar.MONTH));

		// set
		CAL.set(2048, 11, 11);
		System.out.println(CAL.get(Calendar.YEAR) + "-" + CAL.get(Calendar.MONTH) + "-" + CAL.get(Calendar.DATE));

	}
}
