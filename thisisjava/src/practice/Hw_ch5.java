//Q9 학생들의 점수를 분석하는 프로그램을 만들려고 합니다
//키보드로부터 학생 수와 각 학생들의 점수를 입력받고 while 문과 Scanner의 nextLine() 메소드를 이용해서
//최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요.
//과목은 3개
//최고 점수
//평균 점수
package practice;
import java.util.Scanner;
public class Hw_ch5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean run=true;
	int num=0;
	int score=0;
	double sum=0;
	double average=0;
	int[] stNum=null;
	int h=0;
	while(run) {
		System.out.println("----------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("----------------------------------------------");
		System.out.println("선택> ");
		int input = Integer.parseInt(scanner.nextLine());
		switch(input){
			case 1:
				System.out.print("학생수> ");
				num = Integer.parseInt(scanner.nextLine());
				stNum= new int[num];
				break;
			case 2:
				for(int i=0;i<num;i++) {
					System.out.print("scores["+i+"]> ");
					score=Integer.parseInt(scanner.nextLine());
					stNum[i]=score;
					}
				System.out.println("");
				break;
			case 3:
				for(int i=0;i<num;i++) {
				System.out.println("scores["+"i"+"]: "+stNum[i]);
				}
				break;
			case 4:
				{for(int j=0;j<stNum.length-1;j++)
					{//최고값구하기
					if(stNum[j+1]>stNum[j])
					 h=stNum[j+1];
					}
				if(stNum[0]>h)
					h=stNum[0];}//최고값구하기
				//평균값구하기
				for(int i=0;i<stNum.length;i++) {
					sum+=(double)stNum[i];
					average=sum/stNum.length;					
				}
				
				System.out.println("최고 점수: "+h);
				System.out.println("평균 점수: "+average);
				break;
		case 5: //swtich-case가 swtich 하위로 보이지만 사실 switch 위치랑 같은 위치고,
					//따라서 if문 input==5에 케이스2) 입력 5하면 인풋 5가 입력되어 브레이크된다.
		System.out.println("프로그램 종료");
		run=false;
}
	}}}
//Q7 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.(for문 이용)
/*	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2};
		int b=0;
		for(int i=0;i<array.length-1;i++) {
			
			if(array[i+1]>array[i]) {
				b=array[i+1];
				}else {
					if(array[0]>array[1])
						b=array[0];
			}
		}
		System.out.println("array의 최대 값은 "+b);
}
}

//Q8주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(중첩 for문 이용)
/*	public static void main(String[] args) {
		int[][] array = {
		 		{95,86},
		 		{83,92,96},
		 		{78,83,93,87,88}
		};
		int m=0;
		int n=0;
		double sum=0;
		double average=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];	
		}
		}
		for(int i=0;i<array.length;i++)
		average=sum/(array[0].length+array[1].length+array[2].length);
		
		System.out.printf("전체 합은 %3.0f\n", sum);
		System.out.println("평균은 "+ average);
	}
}*/
//Q9
/*
package practice;
import java.util.Scanner;
public class Hw_ch5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean run=true;
	int num=0;
	int score=0;
	double sum=0;
	double average=0;
	int[] stNum=null;
	int h=0;
	while(run) {
		System.out.println("----------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("----------------------------------------------");
		System.out.println("선택> ");
		int input = Integer.parseInt(scanner.nextLine());
		switch(input){
			case 1:
				System.out.print("학생수> ");
				num = Integer.parseInt(scanner.nextLine());
				stNum= new int[num];
				break;
			case 2:
				for(int i=0;i<num;i++) {
					System.out.print("scores["+i+"]> ");
					score=Integer.parseInt(scanner.nextLine());
					stNum[i]=score;
					}
				System.out.println("");
				break;
			case 3:
				for(int i=0;i<num;i++) {
				System.out.println("scores["+"i"+"]: "+stNum[i]);
				}
				break;
			case 4:
				{for(int j=0;j<stNum.length-1;j++)
					{//최고값구하기
					if(stNum[j+1]>stNum[j])
					 h=stNum[j+1];
					}
				if(stNum[0]>h)
					h=stNum[0];}//최고값구하기
				//평균값구하기
				for(int i=0;i<stNum.length;i++) {
					sum+=(double)stNum[i];
					average=sum/stNum.length;					
				}
				
				System.out.println("최고 점수: "+h);
				System.out.println("평균 점수: "+average);
				break;
		case 5: //swtich-case가 swtich 하위로 보이지만 사실 switch 위치랑 같은 위치고,
					//따라서 if문 input==5에 케이스2) 입력 5하면 인풋 5가 입력되어 브레이크된다.
		System.out.println("프로그램 종료");
		run=false;
}
	}}}
*/