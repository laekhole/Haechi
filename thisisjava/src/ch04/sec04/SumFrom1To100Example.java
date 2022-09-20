package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum =0;
		int i;//최초 1회 실행
		
		for(i=1,sum=0;i<=100;i++) {//반복 시 마다 실행
			sum +=i;//복합 대입 연산//복합 대입 연산
		}
		System.out.println("1~"+(i-1)+"합: "+sum);

	}


}
