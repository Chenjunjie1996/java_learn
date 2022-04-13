package 继承;

public class Newphone extends Phone {

	@Override // 检查方法正确性
	public void call(String nameString) {
		super.call(nameString);
		System.out.println("打开微信");
		System.out.println("给" + nameString + "发微信");
	}
}
