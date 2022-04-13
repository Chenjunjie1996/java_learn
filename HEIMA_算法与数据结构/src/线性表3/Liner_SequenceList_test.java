package 线性表3;

public class Liner_SequenceList_test {
	public static <T> void main(String[] args) {
		Liner_SequenceList<String> liner_SequenceList = new Liner_SequenceList<String>(5);
		// 增
		liner_SequenceList.insert("yaoming");
		liner_SequenceList.insert("kobo");
		liner_SequenceList.insert("maide");
		liner_SequenceList.insert(1, "james");
		// 查
		String result = liner_SequenceList.get(1);
		System.out.println(result);
		// 删
		String rm_res = liner_SequenceList.remove(0);
		System.out.println(rm_res);

		liner_SequenceList.clear();
		System.out.println(liner_SequenceList.length());

	}
}
