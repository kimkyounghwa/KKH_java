package day04.Ex03_메소드;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("a: ");
		int a= sc.nextInt();
		System.out.println("b: ");
		int b = sc.nextInt();
		
		//덧셈
		int result1 = calculator.plus(a, b);
		System.out.println("a+b : "+result1);
		
		//뺄셈
		int result2 = calculator.minus(a, b);
		System.out.println("a-b : "+result2);
		//곱셈
		int result3 = calculator.multiple(a, b);
		System.out.println("a*b : "+result3);
		//나눗셈
		double result4 = calculator.divide(a, b);
		System.out.println("a*b : "+result4);
		//나머지
		double result5 = calculator.divide(a, b);
		System.out.println("a*b : "+result5);
		
		int arr[]= {10,20,30};
		System.out.println("합계 :"+calculator.sum(arr));
		System.out.println("평균 :"+calculator.avg(arr));
		//printf("포맷",변수):%X>Y(리터럴)
		//-X:양수-크기만큼 칸을 지정하고 오른쪽 정렬
		// : 음수-크기만큼 칸을 지정하고 왼쪽 정렬
		//-Y:지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		//(리터럴):%d(정수),%f(실수),%s(문자열)
		//\n:엔터(개행)
		
	sc.close();
	}
	
	
}
