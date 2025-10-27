package day06.review;

import java.util.Iterator;

public class Ex02_369게임 {

	public static void main(String[] args) {
		// 1부터 100까지 수를 반복하여 출력하면서,
		// 해당 수가 3 또는 6, 9가 뙬대는
		// 자리수마다 369가 되는 개수만큼
		// "*"을 출력하는 프로그램 작성
		// ex) 13:*, 66:**
		// 순서도
		// 1)1-100까지 for문 출력
		// 2)해당 수의 369가 몇개인지 판단
		// A-십의 자리수 369판단
		// B-일의 자리수 369판단
		// 3) 369개수에 따라서 출력
		// A and B --> **
		// A or B --> *
		// 그외 정수

		for (int i = 1; i <= 100; i++) {
			// 십의자리수:i/10
			// 일의자리수:i%10

			int ten = i / 10;
			int one = i % 10;

			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;

			if (ten369 && one369) {
				System.out.println("**");
			} else if (ten369 || one369) {
				System.out.println("*");

			} else

				System.out.println(i + " ");

		}

	}
}
