package practice;

public class check1 {

	public static void main(String[] args) {
String oldStr="홍 길 동";
System.out.println(oldStr);
oldStr = null;
System.out.println(oldStr);
oldStr = "철 수";
System.out.println(oldStr);
oldStr = "영 희";
System.out.println(oldStr);

String testStr="홍, 길, 동";
String[] arr = testStr.split(",");

System.out.println(testStr);
testStr ="김, 철, 수";
System.out.println(testStr);
testStr ="김, 영, 희";
System.out.println(testStr);

}
}

