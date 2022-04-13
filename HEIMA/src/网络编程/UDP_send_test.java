package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_send_test {
	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket ds = new DatagramSocket();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
		}
		// 数据打包
		byte[] bys = line.getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.30.225"), 12345);
		// send
		ds.send(dp);
		// close
		ds.close();
	}
}
