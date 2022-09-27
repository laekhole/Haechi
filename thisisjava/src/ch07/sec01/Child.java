package ch07.sec01;

public class Child extends Parent{

	

	/*
	int a = 10;
	String str="hello";
	void method1(String msg, String name) {
		System.out.println(name+","+msg);
	}
*/
	/*
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name =name;
		System.out.println("Child(String name) call");
	}
	*/

	public int studentNo;

	public Child(String name, int studentNo) {

		this.name=name;
		this.studentNo=studentNo;
	}
}
