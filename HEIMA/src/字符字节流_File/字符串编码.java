package 字符字节流_File;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class 字符串编码 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String S = "中国";
		byte[] bys = S.getBytes(); // default UTF-8
		System.out.println(Arrays.toString(bys)); // [-28, -72, -83, -27, -101, -67]

		byte[] bys1 = S.getBytes("GBK");
		System.out.println(Arrays.toString(bys1)); // [-42, -48, -71, -6]

		// 解码
		String ss = new String(bys);
		System.out.println(ss);

	}
}
