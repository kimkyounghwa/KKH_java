package day01;

import java.util.Scanner;

public class Ex02_scnner {

	public static void main(String[] args) {
		//main 자동완성  ctrl +space
		//Scanner : 표준입력객체
		//클래스타입 객체명 : new 클래스명();
		Scanner sc = new Scanner(System.in);//객체생성
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.println("a :" +  a);
		
		sc.close();//객체를 메모리에서 해제하는 메소드
		
		//sc.nextInt();
		// Scnner 객체를 해제한 후에는 더이상 입력 받을 수 없다.
	}
	
}
