package day06.review;

import java.util.Iterator;

public class Ex04_Lotto {
	// Math.random():0.0xxx~0.9xxx사이의 난수를 반환하는 메소드
	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);

		// 1_6사이의 정수 : 주사위
		// Math.random()*10 : 0.xxxx ~ 9.xxxx
		// (int) (Math.random()*10) : 0~9
		// (int) (Math.random()*6) : 0~5
		// (int) (Math.random()*6)+1 : 1~6
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 : " + dice);

		// (공식)+(int)(math.random()*구새)+시작숫자
		// 1~20사이 랜덤수

		System.out.print("1~20 : ");
		System.out.println((int) (Math.random() * 20) + 1);
		// -20~20사이 랜덤수
		System.out.print("-20~20:");
		System.out.println((int) (Math.random() * 41) - 20);
		// 1~45사이 랜덤수 6개 배열
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			// 중복제거
			for (int j = 0; j <= i-1; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 오름차순 정렬
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.print("로또번호 : ");
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
