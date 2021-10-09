class PG{
    public static void main(String [] a){
	String PGName="Nilaya";
	byte numRoom=8;
	System.out.println("PG Name = "+PGName);
	System.out.println("Number Of Rooms = "+numRoom);
	System.out.println("Food facility = "+Facility.food);
	System.out.println("Bed facility = "+Facility.bed);
	
	}
}
class Facility{
	static final String food="available";
	static final String bed="available";
}
	