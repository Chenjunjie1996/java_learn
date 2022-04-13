package 类加载器;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflect_通过配置文件运行类中的方法 {
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * class.txt className = xxx methodName = xxx
		 */
		Properties prop = new Properties();
		FileReader fileReader = new FileReader("D:\\JAVA\\HEIMA\\src\\类加载器\\a.txt");
		prop.load(fileReader);
		fileReader.close();
		System.out.println(prop);

		String classname = prop.getProperty("className");
		String methodname = prop.getProperty("methodName");
		System.out.println(classname + ", " + methodname);

		Class<?> c = Class.forName(classname);
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getMethod(methodname);
		m.invoke(obj);
	}
}
