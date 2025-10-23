package day02;

import java.util.Scanner;

public class Ex11_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널: ");
		int channel = sc.nextInt();

		switch (channel) {
		case 11:
			System.out.println("mbc-굿데이");

			break;

		case 24:
			System.out.println("EnA-데프콘");

			break;

		case 100:
			System.out.println("넷플릭스-은중과상연,다이루어질지니");
			break;

		case 101:
			System.out.println("왓챠,티빙,쿠팡플레이,디즈니플러스");
			break;
		default:
			System.out.println("공부만한다");
			break;
		}

		sc.close();
	}
}
