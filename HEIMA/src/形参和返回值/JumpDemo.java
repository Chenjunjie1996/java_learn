package 形参和返回值;

public class JumpDemo {
	public static void main(String[] args) {
		JumpOper jo = new JumpOper();
		Jumpping j = new Jumpzi();
		jo.useJumpping(j);

		Jumpping J = jo.getJumpping();
		J.jump();
	}
}
