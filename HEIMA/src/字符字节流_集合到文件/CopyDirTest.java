package 字符字节流_集合到文件;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirTest {
	public static void main(String[] args) throws IOException {
		File files = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\字符流");
		String filesname = files.getName();
		File destfiles = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\copytest");
		if (!destfiles.exists()) {
			destfiles.mkdir();
		}

		File[] listFiles = files.listFiles();
		for (File file : listFiles) {
			String filename = file.getName();
			File destfile = new File(destfiles, filename);

			copyfile(file, destfile);
		}
	}

	private static void copyfile(File file, File destfile) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}
}
