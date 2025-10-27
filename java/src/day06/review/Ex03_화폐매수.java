package day06.review;

import java.util.Scanner;

/**
 * 우리학원에서 박희진님께서 거액의 예산을 주고 전자렌지를 구매하라고 지시하셨다. 이 때 전자렌지 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 : 657,852 50000 :13개 10000: 0개 5000: 1개 1000:2개 500:1개 100:3개 30:1개 10:0개
 * 5:0개 1:2개 위와같이 입력하면, 큰 화폐단위부터 계산하여, 화폐단위별 화폐매수를 출력하는 프로그램을 작성하시오.
 */

public class Ex03_화폐매수 {

	public static void main(String[] args) {
		/**
		 * 순서도 1.필요한 변수 선언 -입력금액,화폐매수,화폐단위 2.구매비 입력 3.화폐매수 계산 1)화폐매수 계산
		 * (화폐매수)=(입력금액)/(화폐단위) ex:(오만원) 657,852/50000 657852/50000=13 잔액계산
		 * 657852-(50000*13), 657852%50000 : 2개 방법 화폐단위변환 번갈아 가면서, /5, /2 연산반복 (화폐단위) =
		 * (화폐단위)/5 (화폐단위) = (화폐단위)/2 4. 3번과정을 반복 : 화폐단위가 1원이 될 때 까지
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("구매비");
		int input = sc.nextInt(); // :입력금액
		int money = 50000;// :화폐단위
		int count = 0;// :화폐매수
		boolean sw = true;

		while (money >= 1) {
			// 화폐매수 계산

			count = input / money;// 화폐매수 = 입력금액/화폐단위
			System.out.println(money + "\t:" +count+ "개");

			input = input % money; // 잔액 = 입력금액%화폐단위

			if (sw) {

				money = money / 5; // 화폐단위 =화폐단위/5
			} else {
				money = money / 2;// 화폐단위=화폐단위/2
			}
			sw = !sw;
		}
		sc.close();
	}
}
