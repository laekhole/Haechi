package practice;


public class Account {
	//필드
    static final int Min_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    //생성자
    private int balance = 0;
    //메소드
    void setBalance(int balance){
        if(balance >= Min_BALANCE && balance<=MAX_BALANCE){
            this.balance=balance;
        }
    }
    int getBalance(){
        return this.balance;
    }
}