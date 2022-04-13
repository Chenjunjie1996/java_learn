package 面向对象;

public class Phone {
	String brand;
	int price;

	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public void getattr() {
		System.out.println("手机的品牌是： " + brand);
		System.out.println("手机的价格是： " + price);
	}

	public void call() {
		System.out.println("打电话");
	}

	public void sendmsg() {
		System.out.println("发短信");
	}

	public static void main(String[] args) {
		Phone applePhone = new Phone("apple", 5999);
		applePhone.call();
		applePhone.sendmsg();
		applePhone.getattr();
		;
	}
}
