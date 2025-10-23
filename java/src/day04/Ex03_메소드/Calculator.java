package day04.Ex03_메소드;

public class Calculator {
	

	// 덧셈
	public int plus(int a, int b) {
		int result1 = a + b;
		return result1;
	}

	// 뺄셈
	public int minus(int a, int b) {
		int result2 = a - b;
		return result2;
	}

	// 곱셈
	public int multiple(int a, int b) {
		int result3 = a * b;
		return result3;
	}

	// 나눗셈
	public double divide(int a, int b) {
		double result4 = (double)a / b;
		return result4;
	}

	// 나머지
	public int remain(int a, int b) {
		int result5 = a % b;
		return result5;
	}

	// 합계
	public int sum(int[] a) {
		int result6 = 0;
		for (int i = 0; i < a.length; i++) {
			result6 += a[i];
		}
		return result6;
	}

	// 평균
	public double avg(int[] a) {
		double result7 = 0;
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		result7 =(double) sum / a.length;
//		result =(double) sum(a) / a.length; //이미 만들어놓은 합계 호출 쓰기
		return result7;
	}

}
