package 常用API;

import java.util.Arrays;

public class String_Sort {
	public static void main(String[] args) {
		String S = "91 27 46 38 50";
		String[] S_array = S.split(" ");
		System.out.println(Arrays.toString(S_array));

		int[] arr = new int[S_array.length];
		for (int i = 0; i < S_array.length; i++) {
			arr[i] = Integer.parseInt(S_array[i]);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		StringBuilder SB = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			SB.append(arr[i] + " ");
		}

		System.out.println("result: " + SB.toString());
	}
}
