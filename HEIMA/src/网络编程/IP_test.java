package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

// IP 网络中设备的唯一标识

public class IP_test {
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress address = InetAddress.getByName("LAPTOP-FRB39JRU");
		InetAddress address = InetAddress.getByName("192.168.30.225");
		String name = address.getHostName();
		String ip = address.getHostAddress();
		System.out.println("主机名：" + name);
		System.out.println("IP地址：" + ip);
	}
}
