package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//Phone으로부터 상속 받은 필드 읽기
		System.out.println(myPhone.model+", "+myPhone.color);
		
		//Phone으로부터 상속받은 메소드 읽기
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("방가요~~");
		myPhone.sendVoice("저도 반가요");
		myPhone.hangUp();
		
		//SmartPhone

	}

}
