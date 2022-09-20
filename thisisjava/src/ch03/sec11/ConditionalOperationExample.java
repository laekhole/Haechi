package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 95;
		String result;

		//if else 문
		if(score>60) {
			result="합격";
		}else {
			result ="불합격";
		}
				
		//삼항식(조건식)
		//System.out.println(score> 60 ? "합격 " : "불합격");
		result = score>60 ? "합격" : "불합격";

		System.out.println(result);
		
		char grade;
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
		grade = (score>90)? 'A' :((score>80)? 'B':((score>70)? 'C':'F'));
		
		System.out.println(grade);
		}

	


}