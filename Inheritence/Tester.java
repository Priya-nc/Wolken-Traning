abstract class Automobile{
	abstract void engine();
	Automobile(){
	}
}
interface Parts{
	void drive();
}
class Vehicle {
	String name;
	
	void speed(){
		System.out.println("Vehicle travales with speed of 50");
	}
}

class Car extends Vehicle{
	Car(){super();}
	void structure(){
System.out.println("It has 4 wheels");
	}
}

class Bike extends Car{
	
	void seats(){
		System.out.println("It has 2 seats");
	}
}
class Tipper extends Automobile{
	void speed(){
		System.out.println("Vehicle travales with speed of 40");
	}
	void size(){
		System.out.println("Tipper is big vehicle");
	}
	void engine(){
		System.out.println("Automobile has engine");
	}
		
}
class Tester{
	
	public static void main(String []ar){
		Automobile automobile=new Tipper();
		Automobile automobile=new Automobile();
		automobile.engine();
		Tipper tipper=new Tipper();
		tipper.speed();
		Vehicle vehicle=new Car();
		Car car = (Car)vehicle;
		car.structure();
		car.speed();
	}
}





		