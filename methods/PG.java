
class PG{
public static void main(String []arg){
	
	Facility f=new Facility();
	f.id=123;
	byte n=8;
	f.name="priya";
	long con=911328395;
	f.email_id="priya@gmail.com";
	f.address="Bangaloru";
	f.type="girl";
	f.website="PG.com";
	String web=f.website;
	f.contact_no=con;
	
	f.details();
	boolean v=f.vaccancy(n);
	System.out.println(v);
	boolean b=f.admission();
	System.out.println(b);
	String foo=f.food();
	System.out.println(foo);
	
	System.out.println("For any details visit website "+web);
	
}
}
class Facility{
	byte id;
	boolean bool;
	
	String name;
	long contact_no;
	String address,email_id,website,type;
	void details(){
		System.out.println("Name : "+name);
		System.out.println("Contact number : "+contact_no);
		System.out.println("Address : "+address);
		System.out.println("Email Id : "+email_id);
	}
		
		boolean vaccancy(byte n){
			System.out.print("you are "+n+" people, ");
		if(n<5 && n>1){
			bool=true;
			System.out.print("Vaccancy Available :");
		}
		else{
		bool=false;
		
		System.out.print("More than 5 people vaccancy not available :");
		}
		
	
	    return bool;
	}
	
	boolean admission(){
		if(name!=null && contact_no!=0 && bool==true){
			bool=true;
			System.out.println("your ID is created "+id);
			if(type=="girl"){
		System.out.print("Girl admission for the girls PG ");}
		else{
		System.out.print("Boy admission for the boys PG");}
		}
		else{
			System.out.print("Admission is not done ");
			bool=false;
		}
		
		
		return bool;
	}
	String food(){
		//System.out.println("yes available");
		return "Yes Food available ";
	}
	
	
			
}