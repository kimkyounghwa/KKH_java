package day05Ex06_static;

public class StaticMember {
	// static 변수
	static int a;
	static int b;

	// 인스턴스 변수
	int c;
	// static 상수
	static final double PI = 3.121592;

	// static 메소드
	public static int sum(int x, int y) {
		int sum = a + b + x + y;
		// sum += c;
		// c는 static 변수가 아니고, 인스턴스 변수이기 때문에
		// 객체 생성시 메모리가 할다오디므로
		// static 메소드가 할당되는 시점에서 접근할 수 없다.
		// 그래서 static 메소드에서는 인스턴스 멤버를 접근할 수 없다.

		return sum;
	}

	public static void main(String[] args) {
		
		//static 메소드는 객체 생성없이 호출 가능 원래는 new 해주어야 한다!!! 
		int sum = sum(10, 20);
		StaticMember.sum(100, 200); //EX. new 생성안하고 호출함!! 

		a = 100;
		

		// 인스턴스 생성
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();

		int a1 = s1.a;
		int c1 = s1.c = 10;
		int a2 = s2.a;
		int c2 = s2.c = 20;

		// PI = 100; 
		//final 은 상수로 지정하는 키워드
		//한번 값을 초기화한 후에는 변경할 수 없다. 

		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
		System.out.println("sum : " + s2.sum(10, 10));

	}
}
