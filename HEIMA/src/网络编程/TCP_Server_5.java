package 网络编程;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server_5 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();

		while (true) {
			new Thread(new ServerThread(s)).start();
		}
	}
}
