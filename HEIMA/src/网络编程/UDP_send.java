package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// UDP协议是不可靠的网络协议，在通信两端各建立一个socket对象，只是发送接收数据的对象
// 1 创建发送端的socket对象(DatagramSocket)
// 2 创建数据，数据打包
// 3 调用对象的方法发送数据
// 4 关闭发送端

public class UDP_send {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();

		byte[] bys = "hello, udp".getBytes();
//		int length = bys.length;
//		InetAddress address = InetAddress.getByName("192.168.1.66");
//		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.30.225"), 10086);

		ds.send(dp);

		ds.close();
	}
}
