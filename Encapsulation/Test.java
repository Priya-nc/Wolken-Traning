import java.util.Scanner;
class Test{
	static Scanner scan;
	static Scientist []scientist;
	static Address []address;
	Scientist scientists;
	Address addres;
	static Test test;
	static int n;
	static String name;
	static byte yearOfExp;
	static String role;
	static String type;
	static String add;
	static String sname;
	static byte houseNo;
    static String area;
    static String city;
    static String state;
    static long pincode;
	
	public static void main(String []arg){
		scan=new Scanner(System.in);
		test=new Test();
		String more=null;
		boolean t=false;
		do{
		System.out.println("To save: save To Dospla: display To Update: update");
		String inp=null;
		inp=scan.nextLine();
		if(inp.equals("save")){
			t=test.save(test);
			if(t)
				System.out.println("Data saved successfully");
		}
		else if(inp.equals("delete")){
			if(t){
			System.out.println("Enter Scientist Name to delete");
			sname=scan.nextLine();
			test.delete(sname);}
			else
			System.out.println("There is no saved data");
		}
		else if(inp.equals("display")){
			if(t)
				test.getAll();
			else
			System.out.println("There is no saved data");
		}
		else if(inp.equals("update")){
			test.update();
		}
		else
			System.out.println("Enter valid data");
		
			
		System.out.println("you want to give more details type more");
		more=scan.nextLine();
		
      }	while(more.equals("more"));
		
	}
	
boolean save(Test test){
	
	test.n=scan.nextInt();
	scientist=new Scientist[n];
	
		
	address=new Address[n];
	scan.nextLine();
	for(int i=0;i<n;i++){
		System.out.println("Enter Scientist Name");
		test.name=scan.nextLine();
		System.out.println("Enter yearOfExp");
		test.yearOfExp=scan.nextByte();
		scan.nextLine();
		System.out.println("Enter Role");
		test.role=scan.nextLine();
		System.out.println("Enter Type");
		test.type=scan.nextLine();
		System.out.println("Enter address");
		test.add=scan.nextLine();
		
		scientists=new Scientist();
		scientists.setName(name);
		scientists.setYearOfExp(yearOfExp);
		scientists.setRole(role);
		scientists.setType(type);
		scientists.setAddress(add);
		
		scientist[i]=scientists;
		
	
		
		//scan.nextLine();
		System.out.println("Enter house No");
		test.houseNo=scan.nextByte();
		scan.nextLine();
		System.out.println("Enter Area");
		test.area=scan.nextLine();
		System.out.println("Enter City");
		test.city=scan.nextLine();
		System.out.println("Enter State");
		test.state=scan.nextLine();
		System.out.println("Enter pincode");
		test.pincode=scan.nextLong();
		scan.nextLine();
		
		
		addres=new Address();
		addres.setHouseNo(houseNo);
		addres.setArea(area);
		addres.setCity(city);
		addres.setState(state);
		addres.setPincode(pincode);
		address[i]=addres;
		
	}
	if((scientist.length)>0)
	return true;
	else
	return false;
}
void update(){
	System.out.println("Enter Scientist name");
	 name=scan.nextLine();
	for(int i=0;i<scientist.length;i++){
	 scientists=scientist[i];
	 addres=address[i];
	 
	 if(scientists.getName().equals(name)){
	    System.out.println("Choose the option");
		String choose=scan.nextLine();
		switch(choose){
			case "yearOfExp":
			    System.out.println("Enter year Of Exp");
				yearOfExp=scan.nextByte();
				scan.nextLine();
				scientists.setYearOfExp(yearOfExp);
				break;
			case "role":
			    System.out.println("Enter role");
				role=scan.nextLine();
				//scan.nextLine();
				scientists.setRole(role);
				break;
		}
	 }
	 
	 
	}
}
void delete(String sname){
	 for(int i=0;i<n;i++){
	if(scientists.getName().equals(sname)){
		scientists=scientist[i];
	    addres=address[i];
		test.name=null;
		test.yearOfExp=0;
		test.role=null;
		test.type=null;
		test.add=null;
		
		scientists.setName(name);
		scientists.setYearOfExp(yearOfExp);
		scientists.setRole(role);
		scientists.setType(type);
		scientists.setAddress(add);
		
		
		
		test.houseNo=0;
		test.area=null;
		test.city=null;
		test.state=null;
		test.pincode=0;
		
		
		addres.setHouseNo(houseNo);
		addres.setArea(area);
		addres.setCity(city);
		addres.setState(state);
		addres.setPincode(pincode);
		
		
	
	
    }
}
}

void getAll(){
	for(int i=0;i<scientist.length;i++){
	 scientists=scientist[i];
	 addres=address[i];
	
	System.out.println(scientists.getName()+"\t"+scientists.getYearOfExp()+"\t"  +scientists.getRole()+ "\t"  +scientists.getType()+ "\t"  +scientists.getAddress());
	System.out.println(addres.getHouseNo() +"\t"+addres.getArea() +"\t"+ addres.getCity()+"\t"+ addres.getState() +"\t"+ addres.getPincode());
	}	

}
}
	
	

	
	