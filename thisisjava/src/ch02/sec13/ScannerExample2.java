package ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner scanner = new Scanner(System.in);//byte => String 변환
		int x;
		int y;

		//x값 입력
		System.out.println("첫 번째 정수를 입력하세요: ");
		String strX=scanner.nextLine();
		
		//y값 입력
		System.out.println("두 번째 정수를 입력하세요: ");
		String strY=scanner.nextLine();
		
		
		//타입 변환
		x= Integer.parseInt(strX);
		y= Integer.parseInt(strY);
		
		//두 수 곱하기
		long result = x * y;
		
		System.out.printf("%d * %d 의 결과:%6d\n", x, y,result);
		

	}

}
