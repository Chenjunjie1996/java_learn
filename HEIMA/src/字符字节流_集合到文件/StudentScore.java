package 字符字节流_集合到文件;

import java.util.Objects;

public class StudentScore {
	private String name;
	private int chinese;
	private int math;
	private int english;

	/**
	 * 
	 */
	public StudentScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param chinese
	 * @param math
	 * @param english
	 */
	public StudentScore(String name, int chinese, int math, int english) {
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chinese, english, math, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentScore other = (StudentScore) obj;
		return chinese == other.chinese && english == other.english && math == other.math
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name + ", " + chinese + "," + math + ", " + english;
	}

	public int getSum() {
		return this.chinese + this.math + this.english;
	}

}
