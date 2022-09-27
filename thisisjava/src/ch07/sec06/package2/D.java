package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	//생성자
	protected D() {
		super();//다른 패키지의 부모(A)클래스의 A() 생성자 접근 가능
		}
	//메소드
	public void method1() {
		this.field="v";//다른 패키지의 부모(A) 클래스의 필드에 접근 가능
		this.method();//다른 패키지의 부모(A) 클래스의 메소드에 접근 가능
	}
	
	public void method2() {
		A a=new A(); //new에 의해서 생성된 객체에 대한 접근 불가
		a.field = "v";//new에 의해서 생성된 객체의 필드에 대한 접근 불가
		a.method();//new에 의해서 생성된 객체의 메소드에 대한 접근 불가
	}

}
