package practice;

public class check1 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "일지매", "임꺽정"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95}};
		System.out.println("-------성적표---------");
		System.out.println("|이름|국어|영어|수학|총점|");
		System.out.println("---------------------");
								int[] subject = new int[3];
		for(int i=0;i<scores.length;i++) {
			int sum=0;
			System.out.print("|"+names[i]+"|");
			for(int j=0;j<scores[i].length;j++) {
								subject[i] += scores[j][i];
				sum+=scores[i][j];
				System.out.print(scores[i][j]+"|");
		//		System.out.print(sum+"|");
//				System.out.print("|"+sum+"|");				
			}
			System.out.print(sum+"|");
			System.out.println("");
		}
		System.out.println("-------------------");
		System.out.print("|총점 |");
		for(int i=0;i<scores.length;i++)
								System.out.print(""+subject[i]+"|");
	}
	
}

/*		int[] arr = new int[3];
		
		arr[0]=10; //arr배열의 첫번째 요소의 값 0에 10을 더한 값을 첫번째 요소에 저장
		arr[0]+=20;//arr배열의 첫번째 요소의 값 10에 20을 더한 값을 첫번째 요소에 저장
		arr[0]+=30;//arr배열의 첫번째 요소의 값 30에 30을 더한 값을 첫번째 요소에 저장
		
		arr[2]+=30;//arr배열의 세번째 요소의 값 0에 30을 더한 값을 첫번째 요소에 저장
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		int result = arr[0]+arr[2];//첫 번째 요소에 저장된 값 + 세 번째 요소에 저장된 값의 결과를 result에 저장
		System.out.println(result);
		 */
	
	
	
	
	
	