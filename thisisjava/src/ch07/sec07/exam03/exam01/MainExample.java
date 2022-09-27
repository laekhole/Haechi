package ch07.sec07.exam03.exam01;

public class MainExample {

	public static void main(String[] args) {
		A a=new B();
		a.method();

		B b =(B)a; //재정의를 안했기 때문에 부모 클래스에서 정의된 메소드대로 실행
		b.method();

	}

}
