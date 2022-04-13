package 常用API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// date

public class 日期 {
	public static void main(String[] args) throws ParseException {

		Date date1 = new Date();
		System.out.println(date1);

		long date = 1000 * 60 * 60;
		Date date2 = new Date(date);
		System.out.println(date2);

		// get time
		Date d = new Date();
		System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
		// set time
		long time = 100 * 60 * 60;
		d.setTime(time);
		System.out.println(d);
		long time1 = System.currentTimeMillis();
		d.setTime(time1);
		System.out.println(d);
		System.out.println("--------");

		// SimpleDateFormat

		// 格式化：date到string
		Date D = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String S = sdf.format(D);
		System.out.println(S);

		// 解析： string到date
		String ss = "2048-08-09 11:11:11";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf1.parse(ss);
		System.out.println(dd);
	}
}
