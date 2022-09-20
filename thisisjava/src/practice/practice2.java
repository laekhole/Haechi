package practice;

public class practice2 {

	public static void main(String[] args) {
		

	long l1 = 10000L;

	System.out.println(l1);
	
	int _1 = 10;
	int $1 = 10;
	
	System.out.println(_1 +", "+ $1);
	
byte byteValue = 10;
byte result = (byte)((byte)byteValue + (byte)byteValue);

System.out.println(result);
byte result2 = (byte)(byteValue+byteValue);
System.out.println(result2);

int var1=125;
for (int i=0; i<5; i++) {
	System.out.printf(var1+" ");
	var1++;


}

int x = 5;
double y = 0.0;
//double z = x % y;
double z = x / y;
System.out.print("\n"+z+"\n");
if(Double.isInfinite(z)||Double.isNaN(z)) {
	System.out.println("값 산출 불가");
} else {
	System.out.println(z+2);
	
}

	}
}

	