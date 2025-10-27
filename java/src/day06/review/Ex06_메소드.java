package day06.review;

import java.util.Scanner;



public class Ex06_메소드 {

	/*덧셈메소드
	 * @param a 첫번째 피연산자
	 * @param b 두번째 피연산자
	 * @return 덧셈 결과
	 */
	public static int plus(int a, int b) {
		
		int result = a+b;
		
		return result;
	}
	public static int minus(int a, int b) {
		if (a<0 || a<0) {
			//return 이후의 코드는
			//이미 메소드를 종료하였기 때문에 실행되지 않는다.
			return 0;
		}
		int result = a-b;
		//return(값);
		//return; 값이 없는경우, 반환타입을 void로 지정해야한다.
		//1.값을 메소드를 호출한 자리로 반환
		//2.메소드 종료
		//3.메모리 해제
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		//메소드 호출: 메소드명(인자1,인자2);
		//전달인자(argment)
		System.out.println(plus(a,b));
		System.out.println(minus(a,b));
		sc.close();
	}
}
