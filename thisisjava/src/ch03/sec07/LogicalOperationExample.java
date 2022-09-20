package ch03.sec07;

public class LogicalOperationExample {

	public static void main(String[] args) {
		//
		int charCode = 'A'; //int 65가 charCode 에 저장됨
		
		if((65 <= charCode) & (charCode<=90)) {
			System.out.println("대문자군요.");
		}
		
		if((97<= charCode)&(charCode<=122)) {
			System.out.println("소문자군요.");
			}
		
		if((48 <=charCode)&(charCode<=57)) {
			System.out.println("0~9 숫자군요.");
		}
		
		
		
		int value = 6;
		if((value%2==0)) {
			System.out.println("짝수군요.");
		}
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		//연산의 우선순위 비교연산(==), 논리비교(||), 대입연산(=)

		boolean result = value%2==0 || value%3==0;
		if(result) {
			System.out.println("2 또는 3의 배수가 아니군요");
		}
		
	}

}
