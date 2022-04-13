package 继承;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone ph = new Phone();
		Newphone np = new Newphone();

		ph.call("xiaohong");
		System.out.println("========");
		np.call("xiaohong");
	}
}
