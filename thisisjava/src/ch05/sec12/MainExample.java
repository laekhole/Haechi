package ch05.sec12;

public class MainExample {

	public static void main(String[] args) {
		MySingleTon ms=null;
		//ms = new MySingleTon();//MySingleTon.java에서 MySingleTon이 private 선언 되었으므로 new로 생성 불가. getInstance 써야함.
		ms = MySingleTon.getInstance();
		ms.greet();

	}

}
