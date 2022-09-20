package practice;

import java.util.Scanner;

public class Practice1 {
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
		
		//		System.out.println(Integer.toBinaryString(intValue));

		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		
		//두 수 곱하기
		long result = x * y; //우변의 결과값이 int*int => long으로 취급되는지, 아니면 long*long => long으로 되어서 가는지...
		
		System.out.println(Long.toBinaryString(result));
		
		System.out.printf("%d * %d 의 결과:%6d\n", x, y,result);
		

	}

}
