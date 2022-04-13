package 网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

// TCP通信协议是一种可靠的网络协议
// 1 创建客户端的Socket对象
// 2 获取输出流 写数据
// 3 释放资源

public class TCP_send {
	public static void main(String[] args) throws IOException {
//		Socket sk = new Socket(InetAddress.getByName("192.168.30.225"), 10086);
		Socket sk = new Socket("192.168.30.225", 10086);

		OutputStream os = sk.getOutputStream();
		os.write("hello,TCP".getBytes());

		sk.close();
	}
}
