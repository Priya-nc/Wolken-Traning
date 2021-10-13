import java.util.Scanner;
class CustumException{
	
 public static void main(String []args){
	CustumException custumException=new CustumException();
	custumException.exam();
	}
 void exam(){
	 Scanner scan=new Scanner(System.in);
	 String inp=scan.nextLine();
    try{
	if(inp.equals("present")){
	   
	      System.out.println("Hall ticket taken");
		  }
    else{
	    throw new NotFoundException("Not taken");
	}
	}
	catch(NotFoundException e){
	   System.err.println(e.getMessage());
	}
 }
}
class NotFoundException extends RuntimeException{
	String msg;
	public NotFoundException(String msg){
		this.msg=msg;
	}
	@Override
	public String getMessage(){
		return msg;
	}
}
	

	   
		 