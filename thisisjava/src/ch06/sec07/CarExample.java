package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		
		Car car=new Car();
		Car car1=
				new Car("sonata","red");
		Car car2=
				new Car("Sonata",200);
		Car car3=
				new Car(200,"sonata");
		Car car4=
				new Car("sonata","white",200);
	System.out.println(car3);
	}

}
