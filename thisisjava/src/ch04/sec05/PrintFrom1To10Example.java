package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int i=1;
		int j=0;
		while(i<=10) {
			j +=i;
			System.out.print(i+" ");
			i++;
		}
		System.out.print("\n" +j);

	}

}
