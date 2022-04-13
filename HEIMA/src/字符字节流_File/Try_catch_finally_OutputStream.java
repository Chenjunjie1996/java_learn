package 字符字节流_File;

import java.io.FileOutputStream;
import java.io.IOException;

public class Try_catch_finally_OutputStream {
	public static void main(String[] args) {
		FileOutputStream fos1 = null;
		try {
			fos1 = new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\IOtest1.txt");
			fos1.write("ATTCG".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos1 != null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
