package Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<String> manList = new ArrayList<String>();
		ArrayList<String> womanList = new ArrayList<String>();
		manList.add("周润发");
		manList.add("成龙");
		manList.add("刘德华");
		manList.add("吴京");
		manList.add("周星驰");
		manList.add("李连杰");
		womanList.add("林心如");
		womanList.add("张曼玉");
		womanList.add("林青霞");
		womanList.add("柳岩");
		womanList.add("林志玲");
		womanList.add("王祖贤");
		Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
		Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
		Stream<String> stream = Stream.concat(manStream, womanStream);
		stream.map(Actor::new).forEach(System.out::println);
	}
}
