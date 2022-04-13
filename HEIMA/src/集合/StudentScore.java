package 集合;

import java.util.Objects;

public class StudentScore implements Comparable<StudentScore> {
	private String name;
	private int ChScore;
	private int MaScore;

	/**
	 * @param name
	 * @param chScore
	 * @param maScore
	 */
	public StudentScore(String name, int chScore, int maScore) {
		this.name = name;
		ChScore = chScore;
		MaScore = maScore;
	}

	/**
	 * 
	 */
	public StudentScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChScore() {
		return ChScore;
	}

	public void setChScore(int chScore) {
		ChScore = chScore;
	}

	public int getMaScore() {
		return MaScore;
	}

	public void setMaScore(int maScore) {
		MaScore = maScore;
	}

	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", ChScore=" + ChScore + ", MaScore=" + MaScore + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ChScore, MaScore, name);
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
		return ChScore == other.ChScore && MaScore == other.MaScore && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(StudentScore o) {
		int num = this.ChScore + this.MaScore - o.ChScore - o.MaScore;
		int num2 = num == 0 ? this.name.compareTo(o.name) : num;

		return num2;
	}

}
