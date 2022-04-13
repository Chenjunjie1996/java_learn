package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
	public static void main(String[] args) throws IOException {
		// 创建服务器端的Socket对象
		ServerSocket ss = new ServerSocket(10086);
		// 监听客户端连接
		Socket s = ss.accept();
		// 读取，先读数据
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println("Server: " + data);
		// 反馈，后写数据
		OutputStream os = s.getOutputStream();
		os.write("数据已接收".getBytes());
		// 释放
		ss.close();
	}
}
