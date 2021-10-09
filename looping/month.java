import java.util.Scanner;
class month{
	public static void main(String []ar){
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		if(num==1){
		System.out.println("Jan");
		}
		else if(num==2){
		System.out.println("Feb");
		}
		else if(num==3){
		System.out.println("Mar");
		}
		else if(num==4){
		System.out.println("April");
		}
		else if(num==5){
		System.out.println("May");
		}
		else if(num==6){
		System.out.println("Jun");
		}
		else if(num==7){
		System.out.println("July");
		}
		else if(num==8){
		System.out.println("Aug");
		}
		else if(num==9){
		System.out.println("Sep");
		}
		else if(num==10){
		System.out.println("Oct");
		}
		else if(num==11){
		System.out.println("Nov");
		}
		else if(num==12){
		System.out.println("Dec");
		}
	    else{
		System.out.println("Enter the valid number");
	    }
	}
	}