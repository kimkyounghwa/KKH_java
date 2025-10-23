package day02;

import java.util.Scanner;

public class Ex09_ElseIf {
	public static void main(String[] args) {
		//성적을 입력받아서, 성적에 따른 학점  A~ F 를 출력하시오.
		Scanner sc= new Scanner(System.in);
		System.out.println("성적 :");
		int score = sc.nextInt();
		char grad ='F';
		
		//if
		//90점 이상, A
		//80점 이상, B
		//70점 이상, C
		//60점 이상, D
		//60점 미만, F
		
//		if(score >=90 && score <=100) grad='A';
//		if(score >=80 && score < 90) grad='B';
//		if(score >=70 && score <80) grad='C';
//		if(score >=60 && score <70) grad='D';
//		if(score < 60 && score >=0) grad='F';
//		System.out.println("학점 :"+grad);
//		
		if(score >=90 && score <=100) grad='A';
		else if(score >=80) grad='B';
		else if(score >=70) grad='C';
		else if(score >=60) grad='D';
		else grad='F';
		System.out.println("학점 :"+grad);
		
		
		
		sc.close();
	}
}
