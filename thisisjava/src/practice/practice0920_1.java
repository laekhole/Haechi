package practice;

public class practice0920_1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x+" "+y);
		int z = ++x + y--;
		System.out.println(z+" "+x+" "+y);
		System.out.println(z+" "+x+" "+y);
		
		int value = 356;
		System.out.println(value/60*60);
		
		int lt=5;
		int lb=10;
		int h=7;
		double area1=(lt+lb)*h/2.0; //2.0이 들어있어서 범위가 더 큰 double형태로 전체 자동형변환
		double area2=(lt+lb)*h*1.0/2;//1.0이 들어 있어서
		double area3=(double)(lt+lb)*h/2;//(double)(lt+lb)가 double형태로 형변환 되어 전체 자동형변환
		double area4=(double)((lt+lb)*h/2);//double이 있지만, 괄호가 더 많이 되어 있는 (lt+lb)*h/2부터 계산. 해당 괄호는 int형이기 때문에 15*7/2=52.
System.out.println(area1+" "+area2+" "+area3+" "+area4);
				
	}

}
