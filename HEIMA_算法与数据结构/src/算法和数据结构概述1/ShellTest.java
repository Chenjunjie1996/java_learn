package 算法和数据结构概述1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellTest {
	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("bash", "-c", "ls", args[0]);

		try {

			Process process = processBuilder.start();

			StringBuilder output = new StringBuilder();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
