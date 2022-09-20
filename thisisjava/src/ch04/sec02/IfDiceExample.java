package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		//Math.random() 메소드. 0.0부터 1.0 미만의 랜덤 실수값 출력해주는 메소드, 실행할 때마다 다른 값(난수) 출력
		// 0.0 <= Math.random() 범위 <1.0
		// 0.0*6 <= Math.random()*6 범위 <1.0*6
		// 0.0 <= Math.random()*6 <6.0			0.000000000000~5.9999999999999
		// (int)로 변경
		// 0<=(int)(Math.random()*6)<6			0 1 2 3 4 5
		// 1씩 덧셈
		// 1<=(int)(Math.random()*6)+1<7		1 2 3 4 5 6
		

		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번 나왔습니다.");
		} else {
			System.out.println("6번 나왔습니다.");
		} 
	}

}
