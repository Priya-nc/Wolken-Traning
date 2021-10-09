import java.util.Scanner;
class EvenOdd{
	public static void main(String []ar){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int num=scan.nextInt();
		int arr[]= new int[10];
		System.out.println("Enter array elememts");
		for(int i=0;i<num;i++){
			
			arr[i]= scan.nextInt();
		}
		for(int j=0;j<num;j++){
			if(arr[j]%2==0){
				System.out.println(arr[j]+"Even number");
			}
			else{
			     System.out.println(arr[j]+"Odd number");
			}
		}
		
		}
	}
		