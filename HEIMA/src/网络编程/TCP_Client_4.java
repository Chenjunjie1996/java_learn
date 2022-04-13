package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCP_Client_4 {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.30.225", 10086);

		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\mkdirs\\IOtest.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
//		bw.write("886");
//		bw.newLine();
//		bw.flush();
		s.shutdownOutput();
		// 接收反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String data = brClient.readLine();
		System.out.println("服务器反馈：" + data);
		bw.close();
		s.close();
	}
}
