package 集合;

// 元素有序
// TreeSet() 自然排序 实现Comparable接口，重写comparaTo 方法
// TreeSet(Comparator comparator) 指定比较器 重写compare方法
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(6);
		ts.add(3);

		for (Integer integer : ts) {
			System.out.println(integer);
		}

		TreeSet<CharSequence> ts1 = new TreeSet<CharSequence>();
		ts1.add("a");
		ts1.add("b");
		ts1.add("d");
		ts1.add("c");
		for (CharSequence charSequence : ts1) {
			System.out.println(charSequence);
		}

	}
}
