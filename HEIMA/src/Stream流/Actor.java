package Stream流;

public class Actor {
	private String name;

	/**
	 * 
	 */
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Actor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}
}
