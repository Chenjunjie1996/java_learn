package 字符字节流_集合到文件;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//标准输入流
public class 特殊操作流_标准输入流 {
	public static void main(String[] args) throws IOException {
		// Scanner 包装
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("input a string: ");
			String line = br.readLine();
			System.out.println(line);
			if (line.equals("exit")) {
				break;
			}

			System.out.println("input a int");
			int i = Integer.parseInt(br.readLine());
			System.out.println(i);
			if (i == 0) {
				break;
			}
		}
	}
}
