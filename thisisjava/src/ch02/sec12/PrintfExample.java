package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //%d의 의미 : double 타입 대입
		System.out.printf("상품의 가격:%6d원\n", value); //%6d의 의미 : %d는 double 타입 대입, 6은 6자리로 대입, 빈 공간은 들여쓰기
		System.out.printf("상품의 가격:%-6d원\n", value); //%-6d의 의미 : %d는 double 타입 대입, -6은 6자리로 대입, -은 빈 공간은 우측에
		System.out.printf("상품의 가격:%06d원\n", value); //%06d의 의미 : %d는 double 타입 대입, 06은 6자리로 대입, 0은 빈 공간은 0으로 채우기
		
		double area = 3.14159*10*10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
		//%10.2f\n의 의미 : %f는 float 타입 대입, 총 10은 10자리, .2는 소숫점 2자리까지만, 따라서 정수부 6자리, . 1자리, 소숫점 2자리 해서 10자리. \n은 줄내림

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d : %-10s : %10s\n", 1, name, job);
	}

}
