class Mall{
public static void main(String []ar){
	Cloth cloth=new Cloth();
	cloth.fPrice=500;
	cloth.sPrice=400;
	cloth.fabric();
	cloth.silk();
}
}

class Cloth{
	
	short fPrice;
	short sPrice;
	void fabric(){
		System.out.println("Fabric cloth price "+fPrice);
	}
	void silk(){
		System.out.println("Silk cloth price "+sPrice);
	}
}