package ch06.sec08;

public class ComputerExample {
	int sumAll(int ... args) {
		int sum=0;
		System.out.println(args.length);
		for(int a:args) sum+=a;
		return sum;
	}

	public static void main(String[] args) {
		ComputerExample ce = new ComputerExample();
		int result = ce.sumAll(1,2,3,4,5);//[1][2][3][4][5]
		System.out.println(result);

		result = ce.sumAll(1,2,3,4,5,6,7,8,9,10);//[1][2][3][4][5][6][7][8][9][10]
		System.out.println(result);
}


}
