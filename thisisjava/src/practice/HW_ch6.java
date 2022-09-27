package practice;

public class HW_ch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Q13)
//answer)

/*

public class Member{

	//field

	String name;

	String id;

	String password;

	int age;

*/

 

 

//Q14)
//answer) 

/*

public class Member{

	//field

	String name;

	String id;

	String password;

	int age;

	

	Member(String name, String id){

		this.name = name;

		this.id = id;

	}

}

*/

 

//Q15)

 

/*

public class Test {

	public static void main(String[] args) {	

		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {

			System.out.println("로그인 되었습니다.");

			memberService.logout("hong");

		} else {

			System.out.println("id 또는 password가 올바르지 않습니다.");

		}

	}

}

 

class MemberService {

	String name;

	String id;

	String password;

	int age;

	

	boolean login(String id, String password) {

		if ((id=="hong")&&(password=="12345")) {

			return true;

		}

		else {

			return false;

		}

	}

	void logout(String id) {

		System.out.println("로그아웃 되었습니다.");

	}	

}

*/

 

//Q16)

/*

public class Printer {

    void println(int a){

        System.out.println(a);

    }

    void println(boolean a){

        System.out.println(a);

    }

    void println(double a){

        System.out.println(a);

    }

    void println(String a){

        System.out.println(a);

    }

}

*/

 

/*

public class PrinterExample {

    public static void main(String[] args){

        Printer printer = new Printer();

        printer.println(10);

        printer.println(true);

        printer.println(5.7);

        printer.println("홍길동");

    }

}

*/

 

//Q17)

/*

public class Printer { 

    static void println(int a){

        System.out.println(a);

    }

    static void println(boolean a){

        System.out.println(a);

    }

    static void println(double a){

        System.out.println(a);

    }

    static void println(String a){

        System.out.println(a);

    }

} 

*/

/*
public class PrinterExample {
    public static void main(String[] args){
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
*/

//Q18)
/*
public class ShopService {
    private static ShopService shopservice = new ShopService();
    
    private ShopService(){}
    
    static ShopService getInstance(){
        return shopservice;
    }
}
*/

/*
public class ShopServiceExample {
    public static void main(String[] args){
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();
        
        if(obj1==obj2){
            System.out.println("같은 ShopService 객체 입니다.");
        }
        else{
            System.out.println("다른 ShopService 객체 입니다.");
        }
    }
}
*/

//Q19)
/*
public class Account {
    static final int Min_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    
    private int balance = 0;
    
    void setBalance(int balance){
        if(balance >= Min_BALANCE && balance<=MAX_BALANCE){
            this.balance=balance;
        }
    }
    int getBalance(){
        return this.balance;
    }
}
*/

/*
public class AccountExample {
    public static void main(String[] args){
        Account account = new Account();
        
        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());
        
        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());
        
        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());
        
        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());
    }
}
*/
	
	}
}