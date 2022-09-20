package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num=(int)(Math.random()*6)+1; // 1~7 정수형이 범위.
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
System.out.println("프로그램 종료");
	}

}
