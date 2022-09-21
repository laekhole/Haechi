package ch05.sec03;

public class ReferenceVariableExample {

	public static void main(String[] args) {
		//참조타입 변수명 = new 참조타입생성자();
		String name1 = new String("홍길동");
		System.out.println("name1의 hashcode: "+name1.hashCode());
		System.out.println("name1의 주소값 identityhashcode: "+System.identityHashCode(name1));

		String name2 = new String("홍길동");
		System.out.println("name2의 hashcode: "+name2.hashCode());
		System.out.println("name2의 주소값 identityhashcode: "+System.identityHashCode(name2));
		//name2에 저장되어있는 주소값을 name3에 저장.
		String name3 = name2;
		System.out.println("name3의 hashcode: "+name3.hashCode());
		System.out.println("name3의 주소값 identityhashcode: "+System.identityHashCode(name3));

		String name4 = "홍길동";
		System.out.println("name4의 hashcode: "+name4.hashCode());
		System.out.println("name4의 주소값 identityhashcode: "+System.identityHashCode(name4));
		
		System.out.println("----------------");
		//== 변수 name1의 값과 name2의 값이 같은지(참조하는 주소가 같은지) 물어봄
		if(name1==name2) {
			System.out.println("name1이 참조하는 객체의 주소는: " +System.identityHashCode(name1)+
			"이고, name2가 참조하는 객체의 주소는 "+System.identityHashCode(name2)+"입니다."+
			"따라서 name1과 name2가 참조하는 주소가 같습니다.");
		}else {
			System.out.println("name1이 참조하는 객체의 주소는: " +System.identityHashCode(name1)+
			"이고, name2가 참조하는 객체의 주소는 "+System.identityHashCode(name2)+"입니다. "+
			"따라서 name1과 name2가 참조하는 주소가 다릅니다.");
			}
		
		System.out.println("\n비교하는 객체가 동등한지 비교(equivalent)");
		System.out.println("-----------------------------------------------");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());

	}

}
