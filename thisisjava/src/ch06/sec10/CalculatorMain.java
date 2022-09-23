package ch06.sec10;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.pi);
		System.out.println(calc.plus(10,20));
		System.out.println(calc.minus(10,20));
	
		//static 멤버는 클래스명.멤버명으로 사용 가능
	System.out.println(Calculator.pi);
	System.out.println(Calculator.plus(10,20));
	System.out.println(Calculator.minus(10,20));
	}
}
