package ch06.sec01;

//은행업무 - 객체화
public class Account {
	//필드(속성-global 변수)
	private String owner; //소유자 //캡슐화(private를 사용함으로써)
	private int balance; //잔고 //캡슐화(private를 사용함으로써)
	private String sno; //계좌번호 //캡슐화(private를 사용함으로써)
	

	
public Account(String owner, int balance, String sno) {
		this.owner = owner;
		this.balance = balance;
		this.sno = sno;
	}
//메소드
	public String getOwner() {	return owner;}
	public int getBalance() {	return balance;}
	public String getSno() {	return sno;}
	
	public int withdraw(int amount) {
		if(balance -amount <0)
			System.out.println("잔고가 모자랍니다.");
		else
			balance -= amount;
		return getBalance();
	}
	public int saveMoney(int amount) {
		balance += amount;
		return getBalance();
	}
	
	void method() {
		
	}

	
}
