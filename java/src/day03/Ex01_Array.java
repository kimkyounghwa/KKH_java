package day03;

public class Ex01_Array {
	public static void main(String[] args) {
		/**
		 * 배열 선연 자료형 변수명[]; 변수명 앞 또는 뒤에 [] 기호를 붙여 배열 선언한다. 배열 생성 변수명 = new 자료형[개수];
		 */
		int arr[];
		arr = new int[5];
		int arr2[] = new int[5];
		int arr3[] = { 1, 2, 3, 4, 5 };

		// 배열 요소 접근
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//배열의 길이 : 배열 요소의 개수 = 배열.length
		int n = arr.length;
		System.out.println("배열의길이 : "+ n);
		
		//배열 반복하기
		//for : ctrl+space 2번째 옵션
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
