package 字符字节流_集合到文件;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class 特殊操作流_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("itheima001", "001");
		prop.put("itheima002", "002");

		for (Map.Entry<Object, Object> entry : prop.entrySet()) {
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key + "," + val);
		}
		Set<Object> keySet = prop.keySet();
		for (Object key1 : keySet) {
			Object val1 = prop.get(key1);
			System.out.println(key1 + "," + val1);
		}

		// Properties 特有方法
		// setProperty , stringPropertyNames, getProperty
		Properties prop1 = new Properties();
		prop1.setProperty("itheima003", "003");
		prop1.setProperty("itheima004", "004");
		System.out.println(prop1.getProperty("itheima003"));

		Set<String> names = prop1.stringPropertyNames();
		for (String string : names) {
			String propval = prop1.getProperty(string);
			System.out.println(string + "," + propval);
		}
	}
}
