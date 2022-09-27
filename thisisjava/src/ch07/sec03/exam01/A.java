package ch07.sec03.exam01;

public class A extends Object{
	public A() {
		System.out.println("A생성자");
	}

}

class B extends A{
	public B() {
		super();//컴파일시 추가됨.
		System.out.println("B생성자");
		
	}
}