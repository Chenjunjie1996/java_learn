package 排序2;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("xiaohong", 21);
		Student s2 = new Student("xiaolv", 22);
		Comparable max = getMax(s1, s2);
		System.out.println(max);

//		TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				int result = o1.getAge() - o2.getAge();
//				int result2 = result == 0 ? o1.compareTo(o2) : result;
//				return result2;
//			}
//		});
	}

	public static Comparable getMax(Comparable c1, Comparable c2) {
		int result = c1.compareTo(c2);
		if (result > 0) {
			return c1;
		} else {
			return c2;
		}
	}
//	public static Comparable getMax(Comparable c1, Comparable c2) {
//		int result = c1.compareTo(c2);
//		int result2 = result == 0 ? c1.hashCode() - c2.hashCode() : result;
//		if (result2 > 0) {
//			return c1;
//		} else {
//			return c2;
//		}
//	}
}
