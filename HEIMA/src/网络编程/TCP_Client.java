package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCP_Client {
	public static void main(String[] args) throws IOException {

		// 创建客户端
		Socket s = new Socket("192.168.30.225", 10086);

		// 获取输出流，先写数据
		OutputStream os = s.getOutputStream();
		os.write("Hello, TCP".getBytes());
		// 接收服务器反馈，后读数据
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println("Client: " + data);
		// 释放资源
		s.close();
	}
}
