package MethodDemo;

public class TEST01 {
	public static void main(String[] args) {
		int[] arr1 = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 11, 22, 33, 44, 55 };
		boolean flag = compareArr(arr1, arr2);
		System.out.println(flag);
	}

	public static boolean compareArr(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length != arr2.length) {
			flag = false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
					break;
				} else {
					continue;
				}
			}
		}
		return flag;
	}

}
