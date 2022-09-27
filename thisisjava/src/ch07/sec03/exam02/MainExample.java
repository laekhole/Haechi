package ch07.sec03.exam02;
public class MainExample {
	public static void main(String[] args) {
		B b1 = new B(); 
		B b2 = new B(10);
		B b3 = new B(10,20);
	}
}
/*
public class A {
	A(){System.out.println("A의 기본 생성자");}
	A(int a){System.out.println("A의 int타입 매개변수 1개짜리 생성자");}
	A(int a, int b){System.out.println("A의 int타입 매개변수 2개짜리 생성자");}
	}
//부모클래스의 생성자 중 원하는 생성자 호출하려면
//super() 메소드 실행
//실행시 매개변수에 해당 값 넘겨주면 JVM이 찾아서 실행
class B extends A{
	B(){//부모생성자 호출 메소드 super(); 반드시 생성자 블럭의 첫줄에 기술.
		super(10,20);
		System.out.println("B의 default 생성자");}
	B(int a){super();
		System.out.println("B의 int타입 매개변수 1개짜리 생성자");}
	B(int a, int b){super(10);
		System.out.println("B의 int타입 매개변수 2개짜리 생성자");}
}
*/