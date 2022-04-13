package 字符字节流_集合到文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 对象序列化流 对象反序列化流
public class 特殊操作流_对象序列化流 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 序列化
		ObjectOutputStream objs = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\对象序列化.txt"));
		Student s1 = new Student("a", "1", "2", "3");
		Student s2 = new Student("b", "4", "5", "6");
		objs.writeObject(s1);
		objs.close();

		// 反序列化
		ObjectInputStream obji = new ObjectInputStream(
				new FileInputStream("C:\\Users\\CHEN JUNJIE\\Desktop\\python\\java\\对象序列化.txt"));
		Object obj1 = obji.readObject();
		Student s = (Student) obj1;
		System.out.println(s);
		obji.close();

		// private static final long serialVersionUID = 42L;
		// transient 某个成员变量不被序列化
	}
}
