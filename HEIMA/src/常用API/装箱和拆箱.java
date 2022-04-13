package 常用API;

// 装箱： 基本数据类型转换为包装类型
// 拆箱： 包装类型转换为基本数据类型

public class 装箱和拆箱 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 装箱
		Integer I1 = Integer.valueOf(100);
		// 自动装箱
		Integer I2 = 100;
		// 拆箱
		I2 = I2.intValue() + 200;
		System.out.println(I2);
		// 自动拆箱
		I2 += 200;
		System.out.println(I2);

		// 使用包装类型时最好先判断是否为null
		// 只要是对象 使用前必须进行不为null判断
		Integer iii = null;
		if (iii != null) {
			iii += 300;
		} else {
			try {
				throw new NullPointerException();
			} catch (Exception e) {
				System.out.println("error :" + e);
			}
			;
		}
		System.out.println("test successfully");
	}
}
