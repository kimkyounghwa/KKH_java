package day03;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		/**
		 * 첫번째 줄에 입력할 개수 n을 입력받고 둘째 줄에 n개의 정수를 공백을 두고 입력받으시오 n 개의 정수 중, 최대값 구하시오 (입력) 5
		 * 90 80 70 600 66 (출력) 최대값:600
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // n개의 요소 갖는 배열
		int max = Integer.MIN_VALUE; //-21억
		
		//배열입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값 :"+ max);
		sc.close();
	}
}
