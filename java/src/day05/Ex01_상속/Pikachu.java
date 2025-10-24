package day05.Ex01_상속;

public class Pikachu {
	public int energy;
	public String type;

	// 기본생성자
	public Pikachu() {
		/*
		 * this.energy = 100; this.type = "전기";
		 */
		this(100, "전기"); // ***기본초기화****
	}

	// 생성자 오버로딩
	public Pikachu(int energy) {
		// this.energy = energy;
		this(energy, "전기");
	}

	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	

}
