package 字符字节流_File;

import java.util.Arrays;

// 字符流 = 字节流 + 编码表
public class 字符流 {
	// 编码 解码
	public static void main(String[] args) {
		String s = "中国"; // [-28, -72, -83, -27, -101, -67]
		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
	}
}
