package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server_2 {
	public static void main(String[] args) throws IOException {
		// 创建服务器socket对象
		ServerSocket ss = new ServerSocket(10086);
		// 监听连接
		Socket s = ss.accept();
		// 获取输入流
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		// 数据写入文本文件
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\TCP.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		ss.close();
		bw.close();
	}
}
