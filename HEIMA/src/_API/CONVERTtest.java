package _API;

public class CONVERTtest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		String S = ArrToStr(arr);
		System.out.println(S);
	}

	public static String ArrToStr(int[] arr) {
		StringBuilder SB = new StringBuilder();
		SB.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				SB.append(arr[i]);
			} else {
				SB.append(arr[i] + ", ");
			}
		}
		SB.append("]");

		String S = SB.toString();
		return S;
	}
}
