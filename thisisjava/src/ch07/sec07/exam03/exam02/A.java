package ch07.sec07.exam03.exam02;

public class A {
	void method() {
		System.out.println("A클래스의 메소드");
	
	}

}

class B extends A{
	//부모 타입으로 프로모션 되더라도 자신 타입으로 캐스팅 되더라도
	//재정의Override된 메소드의 내용이 실행됨
	void method() {
		System.out.println("B클래스에서 재정의 된 메소드");
		
	}
}