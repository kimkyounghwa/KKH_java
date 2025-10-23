package day02;

import java.util.Scanner;

public class Ex01_대입연산자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("X :");
		int x = sc.nextInt();
		System.out.print("Y :");
		int y = sc.nextInt();
		System.out.print("Z :");
		int z = sc.nextInt();
		
		//합계,평균
		int sum = x+y+z;
		double avg = (double)sum/3;
//		(double)     (int)(int) --> 강제형변환 필요, 또는 3.0(double형으로)
//	 	double avg = sum/3.0
//		서로 다른 자료형 연산 시, 결과는 큰 자료형으로 변환된다. 
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
