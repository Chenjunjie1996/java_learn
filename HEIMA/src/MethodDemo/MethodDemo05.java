package MethodDemo;

public class MethodDemo05 {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 98, 73, 60 };
		int number = getMax(arr);
		System.out.println(number);
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			} else {
				continue;
			}
		}
		return max;
	}
}
