package ch03.sec03;
//오류는 안 나는 코드지만, byte 타입이므로 127을 넘기고 -128보다 작아지면 오버플로우/언더플로우가 발생한다. 유의하자!
public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		//반복문
		//오버플로우
		for(int i=0; i<5; i++) {
			var1++; //cf. var1=var1+1;
			System.out.println("var1: "+var1);
		}
		System.out.println("----------:");
		//언더플로우
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: "+var2);
		}

	}

}
