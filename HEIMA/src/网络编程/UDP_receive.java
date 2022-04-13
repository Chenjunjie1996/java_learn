package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 1 创建接收端的Socket对象(DatagramSocket)
// 2 创建一个数据包，用于接收数据
// 3 调用DatagramSocket对象的方法接收数据
// 4 解析数据包，显示在控制台
// close

public class UDP_receive {
	public static void main(String[] args) throws IOException {
		while (true) {
			DatagramSocket ds = new DatagramSocket(10086);
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			ds.receive(dp);

			System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));

//			ds.close();
		}

	}
}
