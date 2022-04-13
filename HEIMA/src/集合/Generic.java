package 集合;

public class Generic<T> {
	private T keyT;

	/**
	 * @param keyT
	 */
	public Generic(T keyT) {
		this.keyT = keyT;
	}

	public T getKeyT() {
		return keyT;
	}

	public void setKeyT(T keyT) {
		this.keyT = keyT;
	}

	// 泛型方法
	public <T> void show(T t) {
		System.out.println(t);
	}

}
