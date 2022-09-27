package ch07.sec08.exam02;

//참조변수 instanceof 바꿀타입
//참조변수가 해당타입으로 바꿀 수 있으면 true
//아니면 false
public class Driver {
//Vehicle타입만 매개변수로 받음
	public void drive(Vehicle vehicle) {
	vehicle.run();
	if(vehicle instanceof Taxi) {//원래 Taxi객체로 만들어져서 Vehicle로 변환되어 넘어왔는지 true/false
		Taxi taxi =(Taxi)vehicle;
	}else if(vehicle instanceof Bus){
		Bus bus =(Bus)vehicle;
	}
}
}