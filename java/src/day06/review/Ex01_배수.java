package day06.review;

import java.util.Scanner;

public class Ex01_배수 {
	// main : ctrl + spacw
	// 프로그램 실행 시 , 가정 먼저 실행되는 메소
	public static void main(String[] args) {

		// 정수 하나를 입력받아서
		// 입력받으 ㄴ수가 3의 배수인지 아닌지,
		// 판단하고 그 여부를 출력하는 프로그램을 작성하시오
		// 3의 배수 o :"3의 배수입니다"
		// 3의 배수x : "3의 배수가 아닙니다.
		// 순서도
		// 1.정수입력
		// 2.3의배수인지판단
		// 3.3의배수여부 출력

		// import 방법
		// 1) 클래스 뒤에서 ctrl+space
		// 2) 같은 줄에서 ctrl+1
		// 3) 아무데서나 ctrl+shift+o
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n != 0 && n % 3 == 0) {
			System.out.println("3 배수입니다.");
		} else
			System.out.println("3의 배수가 아닙니다.");

		// 조건연산자 (조건)?(참일 때):(거짓일때)
		// if~else 구문과 조건연산자는 치환할 수 있다.
		String answer = (n != 0 && n % 3 == 0) ? "3의배수" : "3의배수아님";
		System.out.println(answer);

		sc.close();
	}

}
