package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";//String 타입의 객체는 리터럴로 생성시 new String()으로 자동 생성
		System.out.println(hobby.hashCode());
		hobby=null;//null은 기본타입에서 사용불가, 참조타입의 초기화로 사용가능.\
		//null pointer 예외 발생 java.lang.NullPointerException 참조 변수가 어떤 객체도 참조하고 있지 않을 때 뜨는 에러.
		//System.out.println(hobby.hashCode());

		//char c='여';
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: "+kind2);

	}

}
