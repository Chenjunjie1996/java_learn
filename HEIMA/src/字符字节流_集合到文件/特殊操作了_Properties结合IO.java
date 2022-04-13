package 字符字节流_集合到文件;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// load store 字符流 字节流
public class 特殊操作了_Properties结合IO {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\properties");
		if (!srcFile.exists()) {
			srcFile.mkdir();
		}
		// store(srcFile);
		load(srcFile);
	}

	private static void store(File srcFile) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("itheima001", "001");
		prop.put("itheima002", "002");

		FileWriter fw = new FileWriter(srcFile + "\\properties.txt");
		prop.store(fw, null);
		fw.close();
	}

	private static void load(File srcFile) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileReader fr = new FileReader(srcFile + "\\properties.txt");
		prop.load(fr);
		System.out.println(prop);
		fr.close();

	}

}
