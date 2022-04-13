package 符号表4;

public class 符号表Test {
	public static void main(String[] args) {
		符号表<Integer, String> st = new 符号表<Integer, String>();
		st.put(1, "qiaofeng");
		st.put(2, "xuzhu");
		st.put(3, "duanyu");
		System.out.println(st.size());
		System.out.println(st.get(1));
		st.delete(2);
		System.out.println(st.size());

		有序符号表<Integer, String> st1 = new 有序符号表<Integer, String>();
		st1.put(1, "qiaofeng");
		st1.put(2, "xuzhu");
		st1.put(4, "duanyu");
		st1.put(3, "t");

	}
}
