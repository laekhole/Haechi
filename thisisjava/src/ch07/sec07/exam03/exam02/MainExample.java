package ch07.sec07.exam03.exam02;

public class MainExample {

	public static void main(String[] args) {
		//메소드의 동적 바인딩
		A a=new B();
		a.method();

		//
		B b =(B)a; //부모타입으로 강제형 변환하더라도 재정의된 메소드 실행됨.
		b.method();

	}

}
