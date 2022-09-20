package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//if문블럭 내에 명령문이 하나만 있으면 블럭{} 생략 가능
		if(i%2==0) //{짝수면 continue 실행해서 뒤 프린트 안하고 다시 i에 1 더함.
			continue;
		//}
		System.out.print(i+" ");;
		}
		
		}

	}


