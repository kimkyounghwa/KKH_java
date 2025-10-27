package day06.Ex02_인터페이스;

public interface RemoteControl {
	//상수
	//인터페이스 변수 선언 시, (public static final)자동선언
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	//추상메소드
	//(public abstract 가 자동 선언
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	//디폴트메소드
	//구현한 객체가 오버라이딩 하지 않아도 기본으로 사용할 수 있는 메소드
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차되었습니다");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행모드시작합니다");
			setSpeed(10);
		}
	}
	//static메소드
	//구현 객체가 없어도 인터페이스만으로도 호출이 가능한 메소드
	static void changeBatter() {
		System.out.println("배터리를 교체합니다");
	}
}
