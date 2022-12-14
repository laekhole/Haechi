package ch03.sec06;

public class CompareOperationExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1==num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 :"+result1);
		System.out.println("result2 :"+result2);
		System.out.println("result3 :"+result3);
		
		char char1 = 'A';//65(ASCII=UNICODE 65에 해당)
		char char2 = 'B';//66(ASCII코드 66에 해당)
		boolean result4 = (char1< char2); //65<66, 비교 연산시 int타입으로 변환되어 연산
		System.out.println("result4 :"+result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3==num4);// 피연산자(num3) 연산자(==) 피연산자(num4)
		System.out.println("result5 :"+ result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);//false 0.1 == 0.1 (단정밀도와 배정밀도의 차이 때문)
		boolean result7 = (num5 == (float)num6);//true
		System.out.println("result6 :"+result6);
		System.out.println("result7 :"+result7);
		
		//String의 문자열 값 "" 비교는 eqauls() 메소드를 사용
		String str1 = "자바"; //C790(12*16^3+7*16^2+9*16+0), BC14(11*16^3+12*16^2+1*16^16+4)
		String str2 = "Java";//65 97 118 97
		boolean result8 = (str1 == str2);
		boolean result9 = (str1.equals(str2));

		//str1과 str2 변수가 저장하고 있는 String 객체의 번지수
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println("result8: "+result8);
		System.out.println("result9: "+result8);

	}
	
}
