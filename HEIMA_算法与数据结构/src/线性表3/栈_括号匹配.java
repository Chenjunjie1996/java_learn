package 线性表3;

// 是否成对出现

public class 栈_括号匹配 {
	public static void main(String[] args) {
		String str = "(sh(xian)())";
		String str1 = "(nj)(()";
		boolean match = isMatch(str);
		System.out.println(match);
		boolean match1 = isMatch(str1);
		System.out.println(match1);
	}

	private static boolean isMatch(String str) {
		// TODO Auto-generated method stub
		栈<String> st = new 栈<String>();
		for (int i = 0; i < str.length(); i++) {
			String s = str.charAt(i) + "";
			if (s.equals("(")) {
				st.push(s);
			} else if (s.equals(")")) {
				String pop = st.pop();
				if (pop == null) {
					return false;
				}
			}
		}
		if (st.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
