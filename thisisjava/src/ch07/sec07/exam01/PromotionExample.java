package ch07.sec07.exam01;

class A{}//																A
class B extends A{}	//											  	  B   C
class C extends A{}	//												 D     E
class D extends B{}	//											   		 
class E extends C{}


//자동형 변환(Promotion- upcasting)
public class PromotionExample {
	public static void main(String[] args) {
		A a = new A();
		  a = new B();//A타입으로 변환 되어 대입
		  a = new C();//A타입으로 변환 되어 대입
		  a = new D();//A타입으로 변환 되어 대입
		  a = new E();//A타입으로 변환 되어 대입

		B b = new B();
		  b = new D();//B타입으로 변환되어 대입
		  
		C c = new C();
		  c = new E();//C타입으로 변환 되어 대입

		D d = new D();
	
		E e = new E();
		
		//객체를 참조하는 참조 변수 대입 가능
		a = b;
		a = c;
		a = d;
		a = e;
		
		a = b;//시작이 B객체로 생성 되어 시작
		B b2 =(B) a;//강제 형변환(downcasting)
		// B -> A -> B -> D
//		A a2 = new B();
//		B b3 = (B) a2;
//		D d2 = (D) b3;
		
		//컴파일 오류 안 남
		//실행시 ClassCastingException  발생
		B b4 = new B();
		C c4 = new C();
		A a4 = b4;//B -> A
		C c5 = (C) a4;// B -> A -> C
		}
}