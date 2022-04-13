package 线性表3;

public class 栈test {
	public static void main(String[] args) {
		栈<String> st = new 栈<String>();

		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		for (String string : st) {
			System.out.println(string);
		}
		System.out.println(st.size());
		System.out.println("---------------------");
		String res = st.pop();
		System.out.println(res);
		System.out.println(st.size());
	}
}
