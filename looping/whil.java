import java.util.Scanner;
class whil{
	public static void main(String []ar){
		Scanner scan=new Scanner(System.in);
		
		String c;
		String b="ab";
		do{
		System.out.println("continue ab else b");
		
		c=scan.nextLine();
		System.out.println(c);
	}
        while(c.equals(b));	
	
	
	}
}