package day02;

public class Ex17_OddEven {
	public static void main(String[] args) {
		//1 ~ 20까지 정수 중, 
		//홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오. 
		// 1,3, ~ 19 까지
		//2,4 ~ 20 까지
		
		int a = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		while(a<=20) {
			if(a%2==0) 
				sum1+=a;			
			else 
				sum2 +=a;
			a++;				
							
		}
		System.out.println("짝수의 합계 :"+sum1);
		System.out.println("홀수의 합계 : "+sum2);
		
	}
}
