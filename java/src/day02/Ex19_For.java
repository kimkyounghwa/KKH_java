package day02;

public class Ex19_For {
	public static void main(String[] args) {
		// for(1초기식; 2조건식; 4증감식){3실행문}
		// 실행순서 : 1-> 반복(2->3->4)
		// 초기식에서 반복 변수 선언

		// 1. 1~10까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

		}
		System.out.println();

		// 2.50~ 100까지 정수를 출력하시오
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 20; i++) {// int 1=2; i<=20; i+=2; 2씩 증가
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 3. 1~20 까지 짝수만 출력
		for (int i = 1; i <= 20; i += 2) {
			System.out.print(i + " ");

		}
		// 4. 홀수만 출력
	}
}
