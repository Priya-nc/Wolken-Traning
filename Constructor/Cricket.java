class Cricket{
public static void main(String []ar){
	
	CricketTeams teams=new CricketTeams("kohli");
	CricketTeams teams1=new CricketTeams();
	//teams.rCaptain="kohli";
	teams.cskCaptain="Dhoni";
	teams.dCaptain="Rishabh Pant";
	teams.RCB();
	teams.CSK();
	teams.Delhi();	
   }
}

class CricketTeams{
	String rCaptain;
	String cskCaptain;
	String dCaptain;
	
	CricketTeams(){
		System.out.println("Cricket Teams");
	}
	CricketTeams(String rCaptain){
		rCaptain=rCaptain;
	}
	
	void RCB(){
		System.out.println("Captain in RCB"+" " +rCaptain);
	}
	void CSK(){
		System.out.println("Captain in CSK"+" " +cskCaptain);
	}
	void Delhi(){
		System.out.println("Captain in Delhi"+" " +dCaptain);
	}
}