package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCP_Client_3 {
	public static void main(String[] args) throws IOException {
		// 创建客户端
		Socket s = new Socket("192.168.30.225", 10086);
		// 文本
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\mkdirs\\IOtest.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
