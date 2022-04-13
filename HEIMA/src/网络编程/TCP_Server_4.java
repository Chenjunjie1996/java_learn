package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server_4 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\TCP.txt", true));

		String line;
		while ((line = br.readLine()) != null) {
//			if ("886".equals(line)) {
//				break;
//			}

			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// 服务器给出反馈
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwServer.write("文件上传成功");
		bwServer.newLine();
		bwServer.flush();

		bw.close();
		ss.close();
	}
}
