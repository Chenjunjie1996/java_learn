package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server_1 {
	public static void main(String[] args) throws IOException {
		// 创建服务器socket对象
		ServerSocket ss = new ServerSocket(10086);
		// 监听连接
		Socket s = ss.accept();
		// 获取输入流
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		ss.close();
	}
}
