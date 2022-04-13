package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_receive_test {
	public static void main(String[] args) throws IOException {
		// 创建socket
		DatagramSocket ds = new DatagramSocket(12345);
		// 创建数据包接收数据
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		// receive
		ds.receive(dp);
		// 解析
		System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
		// 关闭
		ds.close();
	}
}
