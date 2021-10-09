class Wolken{
	public static void main(String []arg){
		
		Employee emp1=new Employee();
		Employee emp2=new Employee(123);
		Employee emp3=new Employee(123,"priya","priya@gmail.com",811328395);
		emp3.details();
	}
}

class Employee{
	int id;
	String name,email_id;
	long contact_no;
	int a;
	
	
	Employee(){
		
		a=100;
	}
	Employee(int id){
		this();
		this.id=id;
	}
	Employee(int id, String name, String email_id, long contact_no){
		
		this(id);
		this.name=name;
		this.email_id=email_id;
		this.contact_no=contact_no;
	}
	void details(){
		System.out.println("Employee Details");
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Name:"+id);
		System.out.println("Employee Email ID :"+email_id);
		System.out.println("Employee Contact number :"+contact_no);
		System.out.println("There are totally "+a+" Employees in Wolken");
	}
		
}

		
		