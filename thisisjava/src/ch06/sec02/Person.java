package ch06.sec02;

public class Person {
	//Calculator 타입의 calculator를 선언하고
	Calculator calculator;
	
	public static void main(String[] args) {
		Person person = new Person();
		double result = person.calculator.calc(10, "+", 20);
		System.out.println(result);

	}

}
