package 字符字节流_集合到文件;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirTest_多级 {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\copytest");
		File destFile = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java");
		copyDir(srcFile, destFile);
	}

	// 复制文件夹
	private static void copyDir(File srcFile, File destFile) throws IOException {
		// TODO Auto-generated method stub
		if (srcFile.isDirectory()) {
			String srcFilename = srcFile.getName();
			File newDir = new File(destFile, srcFilename + "1");
			if (!newDir.exists()) {
				newDir.mkdir();
			}
			// 获取数据源下所有文件或者目录的File数组
			File[] listFiles = srcFile.listFiles();
			for (File file : listFiles) {
				copyDir(file, newDir);
			}
		} else {
			File newFile = new File(destFile, srcFile.getName());
			copyfile(srcFile, newFile);
		}
	}

	// 复制文件
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
