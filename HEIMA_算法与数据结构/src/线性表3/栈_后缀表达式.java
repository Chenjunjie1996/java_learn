package 线性表3;

public class 栈_后缀表达式 {
	public static void main(String[] args) {
		String[] notation = { "3", "17", "15", "-", "*", "18", "6", "/", "+" };
		int result = caculate(notation);
		System.out.println(result);
	}

	private static int caculate(String[] notation) {
		// TODO Auto-generated method stub
		栈<Integer> st = new 栈<Integer>();
		Integer res = 0;
		for (String str : notation) {
			if (str != "+" && str != "-" && str != "*" && str != "/") {
				st.push(Integer.valueOf(str));
			} else {
				Integer num1 = st.pop();
				Integer num2 = st.pop();
				if (str == "+") {
					res = num2 + num1;
				} else if (str == "-") {
					res = num2 - num1;
				} else if (str == "*") {
					res = num2 * num1;
				} else if (str == "/") {
					res = num2 / num1;
				}
				st.push(res);
			}
		}
		return res;
	}
}
