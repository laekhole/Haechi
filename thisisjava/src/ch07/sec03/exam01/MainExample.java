package ch07.sec03.exam01;
//자바에서 모든 클래스의 최상위 부모는 Object
//일반클래스는 extends Object가 모두 당연히 있으므로, 생략.
public class MainExample extends Object {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("------------");
		B b = new B();
		System.out.println(b.toString());
		System.out.println(b.hashCode());
		System.out.println(a.toString());
		System.out.println(a.hashCode());
	}

}
