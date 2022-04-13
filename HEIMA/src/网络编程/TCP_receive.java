package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 1 创建服务器端的Socket对象(ServerSocket)
// 2 监听客户端连接，返回一个socket对象
// 3 获取输入流，读数据，显示在控制台
// 4 close

public class TCP_receive {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);

		Socket s = ss.accept();
		InputStream is = s.getInputStream();

		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println("数据是：" + data);

		s.close();
		ss.close();
	}
}
