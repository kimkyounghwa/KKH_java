package day02;

import java.util.Scanner;

public class Ex22_continue {
	public static void main(String[] args) {
		// 5개의 정수 입력, 입력받은 정수 중 양수만 합계하여 출력하기
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		// -3, -1, 1, 3, 5
		// 5번 반복
		// 반복 변수 i = 0~ 4;
		System.out.print("숫자 5개 입력하세요 : ");

		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n < 0)
				continue;
			// continue
			// : 남은 실행문을 무시하고, 다음 반복으로 점프
			// - while : 조건식으로 돌아간다.
			// - for : 증감식으로 들아간다.
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);

		sc.close();
	}
}
