package 字符字节流_集合到文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class 游戏次数Test {
	public static void main(String[] args) throws IOException {
//		FileWriter content = new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\properties\\game.txt");
//		content.write("count=0");
//		content.close();
		Properties prop = new Properties();
		FileReader fr = new FileReader("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\properties\\game.txt");
		prop.load(fr);
		fr.close();

		String count = prop.getProperty("count");
		int i = Integer.parseInt(count);
		if (i >= 3) {
			System.out.println("充值");
		} else {
			Game.start();
			i++;
			prop.setProperty("count", String.valueOf(i));
			FileWriter fw = new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\properties\\game.txt");
			prop.store(fw, null);
			fw.close();
		}
	}
}
