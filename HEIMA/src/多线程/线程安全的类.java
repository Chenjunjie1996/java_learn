package 多线程;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

//  stringbuffer vector hashtable
public class 线程安全的类 {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer();
		StringBuilder sb = new StringBuilder();

		Vector<String> vc = new Vector<String>();
		ArrayList<String> al = new ArrayList<String>();
//		Collection<String> synchronizedCollection = Collections.synchronizedCollection(new ArrayList<String>());
		List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());
		Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<String, String>());

		Hashtable<String, String> ht = new Hashtable<String, String>();
		HashMap<String, String> hm = new HashMap<String, String>();

	}
}
