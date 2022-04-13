package 字符字节流_File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// createNewFile mkdir mkdirs(可以创建父目录)
		File f1 = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java");
		System.out.println(f1.mkdir());

		File f2 = new File(f1, "java.txt");
		System.out.println(f2.createNewFile());

		File f3 = new File(f1, "mkdirs\\test");
		System.out.println(f3.mkdirs());

		System.out.println("=============================");

		// 判断获取 isDirectory isFile exists getAbsolutePath getPath getName list listFiles
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f2.exists());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getPath());
		System.out.println(f2.getName());
		System.out.println(f1.list().length);
		System.out.println(f1.listFiles().length);

		String[] arr1 = f1.list();
		for (String string : arr1) {
			System.out.println(string);
		}

		File[] arr2 = f1.listFiles();
		for (File file : arr2) {
			if (file.isFile()) {
				System.out.println(file);
			} else if (file.isDirectory()) {
				System.out.println(file);
			}
		}

		// 删除
		File f5 = new File(f1, "usedfordel.txt");
		System.out.println(f5.createNewFile());
		System.out.println(f5.delete());

	}

}
