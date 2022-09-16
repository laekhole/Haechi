package ch03.sec02;

public class ArithmaticOperatorExample {

	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10;
		
		int result1 = v1 + v2;
		System.out.println(result1);
		
		long result2 = v1 + v2 -v4;
		System.out.println(result2);

		double result3 = (double)v1/v2;
		System.out.println(result3);


		
		int result4=v1%v2;
		System.out.println(result4);
		System.out.printf("%d을 %d로 나누면 몫은 %d이고 나머지는 %d입니다.\n", v1, v2, v1/v2, v1%v2);

		double result5 = (double)(v1/v2); //복습 : (v1/v2)로 걸어버리면 v1, v2는 정수형 byte 타입이므로 10/4=2로 연산이 되어버림. 거기서 double타입 변환하므로 결과값 2.0
		System.out.println(result5);

		
	}

}
