import java.util.Scanner;
class CountryTest{
public static void main(String []arg){
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter number of country");
	int n=scan.nextInt();
	
	Country []countrys=new Country[n];
	System.out.println("Enter the Details of country");
	for(int i=0;i<countrys.length;i++){
		scan.nextLine();
		Country country=new Country();
		
		System.out.println("Enter the country name");
		String name=scan.nextLine();
		System.out.println("Enter the capital");
		String cap=scan.nextLine();
		System.out.println("Enter the number of states");
		byte numStates=scan.nextByte();
		System.out.println("Enter the population");
		short popula=scan.nextShort();
		System.out.println();
		
		country.setcName(name);
		country.setNoStates(numStates);
		country.setcapital(cap);
		country.setpopulation(popula);
		
		countrys[i]=country;	
		
		
	}
	for(int i=0;i<countrys.length;i++){
		Country country=countrys[i];
	
		System.out.println(country.getcName()+ "\t" +country.getcapital() +  "\t" +country.getNoStates() + "\t"  +country.getpopulation());
	}
}
}
   