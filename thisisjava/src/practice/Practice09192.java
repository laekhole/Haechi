package practice;
import java.util.Scanner;
public class Practice09192 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("점수를 입력하세요.");
			String inpscore = scanner.nextLine();
			int score = Integer.parseInt(inpscore);

			
			String result;

			result = score>60 ? "합격" : "불합격";

			System.out.println(result);
			
			char grade;

			grade = (score>90)? 'A' :((score>80)? 'B':((score>70)? 'C':'F'));
			
			System.out.println(grade);
			
			
			/*
			//if~else 문
			if(score>60) {
				result="합격";
			}else {
				result ="불합격";
			}
			 */
			
			//삼항식(조건식)
			//System.out.println(score> 60 ? "합격 " : "불합격");
			//result = score>60 ? "합격" : "불합격";

//			System.out.println(result);
			
	//		char grade;
			/*
			if(score>90) {
				grade = 'A';
			}else if(score>80) {
				grade ='B';
			}else if{score>70) {
				grade = 'C';
			}else {
				grade = 'F';
			}
			*/
			//삼항조건문
			//grade = (score>90)? 'A' :((score>80)? 'B':((score>70)? 'C':'F'));
			
			//System.out.println(grade);
			}

		


	}