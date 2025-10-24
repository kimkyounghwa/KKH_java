package day05.Ex01_상속;

//상속
//키워드:자식클래스 extends 부모클래스
public class Raichu extends Pikachu {

	// 부모클래스의 생성자를 따라서 생성자 자동완성
	// alt + shift + s + C
	public Raichu() {
		super(300, "메가전기"); // super()를 호출하지 않아도, 부모의 기본생성자 호출한다.
	}

	public Raichu(int energy, String type) {
		super(energy, "메가전기");
	}

	public Raichu(int energy) {
		super(energy);
	}

	// 메소드 오버라이드 : 부모클래스메소드 재정의 및
	// 부모클래스 건너뛰고, 자식클래스 우선 실행
	// 오버라이딩 자동완성 : alt+shift+s+v
	//오노테이션 : 코드의 특별한 기능 또는 설명을 추가하는 방법
	//@어노테이션이름의 형태로 사용한다.
	
	@Override //부모클래스의 메소드를 재정의한 메소드임을 명시하는 어노테이션(생략가능)
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		
		return "아이언테일";
	}

	

}
