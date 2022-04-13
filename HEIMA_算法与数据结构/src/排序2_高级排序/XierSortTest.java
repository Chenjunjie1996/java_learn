package 排序2_高级排序;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class XierSortTest {
	public static void main(String[] args) throws IOException {
//		BufferedWriter bfw = new BufferedWriter(
//				new FileWriter("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\shellsort.txt"));
//		for (int i = 100000; i >= 0; i--) {
//			bfw.write(String.valueOf(i));
//			bfw.newLine();
//		}
//		bfw.flush();
//		bfw.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		BufferedReader bfr = new BufferedReader(
				new FileReader("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\shellsort.txt"));
		String line = null;
		while ((line = bfr.readLine()) != null) {
			int i = Integer.parseInt(line);
			arr.add(i);
		}
		bfr.close();

		Integer[] a = new Integer[arr.size()];
		arr.toArray(a);
		long start = System.currentTimeMillis();
//		排序2.InsetSort.sort(a); // 32000ms
		排序2_高级排序.XierSort.sort(a); // 27ms
//		排序2_高级排序.GuibingSort.sort(a); // 76ms
		long end = System.currentTimeMillis();

//		System.out.println("插入排序用时：" + (end - start));
		System.out.println("希尔排序用时：" + (end - start));
//		System.out.println("归并排序用时：" + (end - start));
	}
}
