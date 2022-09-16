package ch02;

public class variableExchangeExample {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		
		int temp=x;
		System.out.println("temp는 " + temp);
		System.out.println("x는 "+x);
		System.out.println("y는 "+y);
		
		x=y;
		y=temp;
		
		System.out.println("temp는 " + temp);
		System.out.println("x는 "+x);
		System.out.println("y는 "+y);
	}

}
