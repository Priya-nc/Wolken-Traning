import java.util.Scanner;
class Exception {
	static Scanner scan;
	String str;
    public static void main(String []args){
		Exception exp=new Exception();
		scan=new Scanner(System.in);
		int inp=scan.nextInt();
		if(inp==1)
		exp.array();
		else if(inp==2)
		exp.string();
		else if(inp==3)
		exp.input();
		else if(inp==4)
		exp.pointer();
		else if(inp==5)
		exp.stackOverflow();
		else
		System.out.println("Enter valid number");
		
	}
	
	void array(){
	String a[]={"priya","priya"};
	System.out.println(a[3]);
	}
	void string(){
		String b="priya";
		System.out.println(b.substring(8));
	}
	void input(){
		int c;
		scan=new Scanner(System.in);
		c=scan.nextInt();
		System.out.println(c);
		
	}
	void pointer(){
		Exception exp=new Exception();
		exp=null;
		System.out.println(exp.str);
	}
	void stackOverflow(){
		stackOverflow();
	}
}

