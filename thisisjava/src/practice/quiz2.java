package practice;

public class quiz2 {
//ch04.sec07 두 개의 주사위를 던져서 두 눈의 합이 6이 될 때 반복문을 빠져나가도록 수정하시오.
	public static void main(String[] args) {
		while(true) {
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			int sum=num1+num2;
			System.out.println("num1="+num1+" "+"num2="+num2+" "
					+ "sum="+sum);
			if(sum==6){
					break;
		}

	}

}
}