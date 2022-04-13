package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
	private Socket s;

	public ServerThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			BufferedWriter bw = new BufferedWriter(
//					new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\TCP.txt", true));
			// 解决名冲突问题
			int count = 0;
			File file = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\TCP_" + count + ".txt");
			while (file.exists()) {
				count++;
				file = new File("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\TCP_" + count + ".txt");
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bwServer.write("上传成功");
			bwServer.newLine();
			bwServer.flush();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
