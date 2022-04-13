package 堆6;

public class HeapTest {
	public static void main(String[] args) {
		Heap<String> heap = new Heap<>(10);
		heap.insert("A");
		heap.insert("B");
		heap.insert("C");
		heap.insert("D");
		heap.insert("E");
		heap.insert("F");
		heap.insert("G");

		String result = null;
		while ((result = heap.delMax()) != null) {
			System.out.println(result + " ");
		}
	}
}
