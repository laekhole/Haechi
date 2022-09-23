package ch06.sec03;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	//동일 클래스 내에서 다른 생성자를 호출 시 this()를 사용
	public Korean() {
		this.nation="대한민국";
	}
	public Korean(String name, String ssn) {
		this.name = name; //반드시 첫째 줄에 작성
		this.ssn = ssn;
	}
	
	public Korean(String name) {
		this.name=name;
	}	
}

