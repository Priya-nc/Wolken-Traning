import java.util.Scanner;
class IPL{
public static void main(String []args){
	RCB.players();
	RCB.players("paddikal");
	RCB.players("paddikal",1);
	RCB.players("kohli",2);
	RCB.players("ABD",3);
	RCB.players(6,"Max");
	int n=RCB.NoOfPlayers(8);
	System.out.println(n);
	String cap=RCB.captain("kohli");
	System.out.println(cap);
}
}
class RCB{
	static void players(){
		System.out.println("kohli");
		System.out.println("ABD");
	
		System.out.println("========================================");
	}
	static void players(String name){
		System.out.println(name);
		System.out.println("kohli");
		System.out.println("ABD");
	
		System.out.println("=========================================");
	}
	static void players(String name, int number){
		System.out.println(name +" " +number);
		System.out.println("=========================================");
	}
	static void players(int number,String name){
		System.out.println(number +" " +name);
		System.out.println("=========================================");
	}
	static int NoOfPlayers(int num){
		System.out.println("Number of players");
		return num;
	}
	static String captain(String cap){
		System.out.println("RCB Captain");
		return cap;
	}
}
	
	
		