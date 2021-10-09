import java.util.Scanner;
class weeks{
	public static void main(String []ar){
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		if(num==1){
		System.out.println("Sunday");
		}
		else if(num==2){
		System.out.println("Monday");
		}
		else if(num==3){
		System.out.println("Tuesday");
		}
		else if(num==4){
		System.out.println("Wednesday");
		}
		else if(num==5){
		System.out.println("Thursday");
		}
		else if(num==6){
		System.out.println("Friday");
		}
		else if(num==7){
		System.out.println("Saturday");
		}
	    else{
		System.out.println("Enter the valid number");
	    }
	}
	}
	