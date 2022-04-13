package _API;

public class ConnectStr {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		String s_1 = arraytostring(arr);
		System.out.println(s_1);
	}

	public static String arraytostring(int[] arr) {
		String s_1 = "";
		s_1 += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s_1 += arr[i];
			} else {
				s_1 += arr[i];
				s_1 += ", ";
			}
		}
		s_1 += "]";
		return s_1;
	}
}
