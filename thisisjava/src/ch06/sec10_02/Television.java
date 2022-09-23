package ch06.sec10_02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	//static 초기화 블럭
	static {
		info = company + "-" + model;
		}
	static int seq;
	//인스턴스 멤버
	String sno;
	//인스턴스 초기화 블럭
	{
		sno=info+ ++seq;
	}
	public static void main(String[] p) {
		System.out.println(Television.info);
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		Television tv3 = new Television();
		Television tv4 = new Television();
		Television[] tv5 = {tv1, tv2, tv3, tv4};
		
		System.out.println(tv4.info);

	}
	
}
