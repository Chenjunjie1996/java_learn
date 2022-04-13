package 线性表3;

//快慢指针 解决中间值问题，单向链表是否有环问题，有环链表入口问题
public class 链表的反转 {
	public static void main(String[] args) {
		LinkList<String> ll = new LinkList<String>();
		ll.insert("1");
		ll.insert("2");
		ll.insert("3");
		ll.reverse();
		for (String string : ll) {
			System.out.println(string);
		}
	}
}
