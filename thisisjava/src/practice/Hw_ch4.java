package practice;
import java.util.Scanner;
public class Hw_ch4 { //if문만 쓰지 말고 switch문으로 바꿔보기
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			boolean run = true;
			int credit=0;
			while(run) {
				System.out.println("---------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
				String strNum = scanner.nextLine();
				int C;
				if(strNum.equals("1")) {
					System.out.println("예금액>");
					C=Integer.parseInt(scanner.nextLine());
					credit+=C;
				} else if(strNum.equals("2")) {
					System.out.println("출금액>");
					C=Integer.parseInt(scanner.nextLine());
					if(C>credit) {
						System.out.println("잔고가 부족하여 출금할 수 없습니다.");
						credit+=C;}
					credit-=C;
				} else if(strNum.equals("3")) {
					System.out.println("잔고>" + credit);
					}else if(strNum.equals("4")) {
						run = false;
				}
			}
			System.out.println("프로그램 종료");
			}
}



/*
Q1)
3
Q2)


Q3)
		public static void main(String[] args) {
			int i=0;
			int j=0;
			do {
				if((i%3)==0) {
					j+=i;
				}
				i++;
			}while(i<=100);
			System.out.println("1부터 100까지의 정수 중 3의 배수 총합 : "+j);
			}
		}

Q4)
	public static void main(String[] args) {
		while(true) {
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			int sum=num1+num2;
			System.out.println("num1="+num1+" "+"num2="+num2+" "
					+ "sum="+sum);
			if(sum==5){
					break;
			}
		}
	}
}

Q5)
	public static void main(String[] args) {

		int x;
		int y;
		for(x=1;x<=10;x++) {
			for(y=1;y<=10;y++) {
				int z=4*x+5*y;
				if(z==60) {
					System.out.println("("+x+","+y+")");
					break;
				}
			}
		}

	}
Q6)
	Answer1)
		public static void main(String[] args) {
			System.out.print("*");

			System.out.print("\n");
			for(int b=1;b<=2;b++) {
				System.out.print("*");
			}
			System.out.print("\n");
			for(int c=1;c<=3;c++) {
				System.out.print("*");
			}
			System.out.print("\n");
			for(int d=1;d<=4;d++) {
				System.out.print("*");
			}
			System.out.print("\n");
			for(int e=1;e<=5;e++) {
				System.out.print("*");}
	}
}

	Answer2)
		public static void main(String[] args) {
			int i;
			int j;
		for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
		System.out.print("*");
		if(j==i) {
		System.out.print("\n");
		}
		}
		
	}

	}
}
	Answer3)
			int i;
			int j;
		for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
		System.out.print("*");
		}
		System.out.print("\n");
		
	}

//Q7)
 *
import java.util.Scanner;
public class Hw_ch4 {
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			boolean run = true;
			int credit=0;
			while(run) {
				System.out.println("---------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
				String strNum = scanner.nextLine();

				String depositCash;
				int dC;
				String withdrawCash;
				int wC;
				if(strNum.equals("1")) {
					System.out.println("예금액>");
					depositCash = scanner.nextLine();
					dC=Integer.parseInt(depositCash);
					credit+=dC;
				
				} else if(strNum.equals("2")) {
					System.out.println("출금액>");
					withdrawCash = scanner.nextLine();
					wC=Integer.parseInt(withdrawCash);
					if(wC>credit) {
						System.out.println("잔고가 부족하여 출금할 수 없습니다.");
						credit+=wC;}
					credit-=wC;
					

				} else if(strNum.equals("3")) {
					System.out.println("잔고>" + credit);//왜 credit 갱신 안 되는지 체크중
														//while문이라 if문 해결 후 위 while로 돌아가면 credit=0으로 초기화되었음. 그래서 credit 초기값을 while 위로 뺌.
				
				}else if(strNum.equals("4")) {
						run = false;
				}
			}

			System.out.println("프로그램 종료");
				
			}
}
*/