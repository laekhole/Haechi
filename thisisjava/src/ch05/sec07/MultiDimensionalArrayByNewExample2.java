package ch05.sec07;

public class MultiDimensionalArrayByNewExample2 {

	public static void main(String[] args) {
		//[0][0][0]
		//[0][0][0]
		int[][] mathScores = new int[2][3];
		//배열 항목 값 변경
		mathScores[0][0]=80;		mathScores[0][1]=83;		mathScores[0][2]=85;
		mathScores[1][0]=86;		mathScores[1][1]=90;		mathScores[1][2]=92;
		
		//합과 평균 구하기
		int mathSum=0;
		for(int i=0;i<mathScores.length;i++) {
			for(int j=0;j<mathScores[i].length;j++) {
				mathSum = mathSum + mathScores[i][j];
			}
		}
		System.out.println("전체 합: "+mathSum);
//		int n=0;
	//	int a=0;
		//for(a=0; a mathSum[a].length
		System.out.println("전체 평균: "+(double)mathSum/mathScores.length/mathScores[0].length);
		
		String[] names = {"홍길동", "일지매", "임꺽정"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95}};
		System.out.println("------------성적표--------------");
		System.out.println("| 이름 | 국어 | 영어 | 수학 | 총점 |");
		System.out.println("-------------------------------");


		for(int i=0;i<scores.length;i++) {
			int sum=0;
			System.out.print("|"+names[i]+"|");
			for(int j=0;j<scores[i].length;j++) {
			System.out.print(+scores[i][j]+"|");
			sum+=scores[i][j];
			}
			System.out.println(sum);
			
			
		/*	for(int i=0;i<scores.length;i++) {
				int sum=0;
				System.out.print("|"+names[i]+"\t|");
				for(int j=0;j<scores[i].length;j++) {
					System.out.print(scores[i][j]+"\t|");
					sum+=scores[i][j];
				}
			    System.out.println(sum);
		}*/
	/*	int[] sum = null;								//배열 이해 못한듯.
		for(int i=0;i<scores.length;i++) {						//sum에 어레이 넣고 하고 싶었는데,
		for(int j=0;j<scores[i].length;j++) {
		sum[i]=sum[i]+scores[i][j];}							//이 부분에서 오류난 듯... 
		}*/
	}

}
}
