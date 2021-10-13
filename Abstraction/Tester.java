class Vehicle {
	String name;
	
	void speed(){
		System.out.println("Vehicle travales with speed of 50");
	}
}

class Car extends Vehicle{
	
	void structure(){
System.out.println("It has 4 wheels");
	}
}

class Bike extends car{
	
	void seats(){
		System.out.println("It has 2 seats");
	}
}
class Tipper extends Vehicle{
	
	void size(){
		System.out.println("Tipper is big vehicle");
	}
}
class Tester{
	
	public static void main(String []ar){
		Tipper T=new Tipper();
		T.size();
		T.speed();
	}
}



		