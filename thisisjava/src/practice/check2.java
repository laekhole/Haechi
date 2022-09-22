package practice;
public class check2 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "일지매", "임꺽정", "김길동","김철수","김영희"};
		int[][] scores = {{80,83,85,65},{86,90,92,100},{88,87,95,82},{80,87,90,99},{88,55,92,75},{74,56,89,85}};
		System.out.println("-------성적표---------");
		System.out.println("|이름|국어|영어|수학|총점|");
		System.out.println("---------------------");
		
		int[] subject = new int[scores[0].length];
		int sumSum=0;	
		int a=0;
		int b=0;
		int c=0;
		
		
		for(int i=0;i<names.length;i++) {
		a+=scores[i][0];
		b+=scores[i][1];
		c+=scores[i][2];
		}
		System.out.println(a+"|"+b+"|"+c);		
		
			for(int i=0;i<names.length;i++) {
			int sum=0;
			System.out.print("|"+names[i]+"|");
			for(int j=0;j<scores[i].length;j++) {
												subject[j] += scores[i][j];
				sum+=scores[i][j];
				System.out.print(scores[i][j]+"|");
			}
			System.out.print(sum+"|");
			System.out.println("");
		}
		System.out.println("-------------------");
		System.out.print("|총점 |");
		for(int i=0;i<scores[i].length;i++) {
			System.out.print(subject[i]+"|");
			sumSum+=subject[i];}
		System.out.print(sumSum+"|");
	}
}