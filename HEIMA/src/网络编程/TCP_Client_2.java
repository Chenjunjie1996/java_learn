package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCP_Client_2 {
	public static void main(String[] args) throws IOException {
		// 创建客户端
		Socket s = new Socket("192.168.30.225", 10086);
		// 获取输出流，先写数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 封装输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			// 获取输出流对象
//			OutputStream os = s.getOutputStream();
//			os.write(line.getBytes());
			bw.write(line);
			bw.newLine();
			bw.flush();

		}
		s.close();
	}
}
