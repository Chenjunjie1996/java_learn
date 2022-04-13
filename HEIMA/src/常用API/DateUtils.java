package 常用API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	private DateUtils() {
	}

	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String s = sdf.format(date);
		return s;
	}

	public static Date stringToDate(String s, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date dd = sdf.parse(s);
		return dd;
	}

	public static void main(String[] args) throws ParseException {
		String format = "yyyy-MM-dd HH:mm:ss";
		Date d = new Date();
		String S1 = DateUtils.dateToString(d, format);
		System.out.println(S1);

		String S = "2011-11-12 03:04:05";
		Date dd = DateUtils.stringToDate(S, format);
		System.out.println(dd);
	}
}
